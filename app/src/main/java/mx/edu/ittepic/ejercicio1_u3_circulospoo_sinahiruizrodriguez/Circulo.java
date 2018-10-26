package mx.edu.ittepic.ejercicio1_u3_circulospoo_sinahiruizrodriguez;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;



    public class Circulo {
        float x,y;
        int desplazamiento, dy;
        CountDownTimer t;
        int color, r;

        public Circulo(int posx, int posy, final Lienzo l, int c)

        {

            x=posx;
            y=posy;
            color=c;

            t=new CountDownTimer(1000, 20) {
                @Override
                public void onTick(long millisUntilFinished) {
                    x+=desplazamiento;
                    if(x>=l.getWidth()-90)
                    {

                        desplazamiento*=-1;
                    }
                    if(x<=90)
                    {
                        desplazamiento*=-1;
                    }

                    y+=dy;
                    if(y>=l.getHeight()-90)
                    {
                        dy*=-1;
                    }

                    if (y<=90)
                    {
                        dy*=-1;
                    }

                    l.invalidate();


                }

                @Override
                public void onFinish() {
                    start();
                }
            };


        }

        public  void pintar(Canvas c, Paint p, int r)
        {
            p.setColor(color);
            c.drawCircle(x, y,r,p);

        }

        public  void mover( int desplaza, int desplazay)
        {
            desplazamiento=desplaza;
            dy=desplazay;

            t.start();
        }

    }
