package mx.edu.ittepic.ejercicio1_u3_circulospoo_sinahiruizrodriguez;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;



    public class Lienzo extends View {
        Circulo n1,n2, n3, n4, n5;
        int color;

        public Lienzo(Context context) {
            super(context);
            n1=new Circulo(100, 200, this, Color.parseColor("#B996ED")); //
            n1.mover(15, 15); //Que tan rapido movera el circulo

            n2=new Circulo(300, 400, this, Color.parseColor("#F39BC1"));
            n2.mover(5, 5); //Que tan rapido movera el circulo

            n3=new Circulo(500, 500, this, Color.BLACK); //Coordernadas donde colocaremos nuestro circulo
            n3.mover(10, 10); //Que tan rapido movera el circulo

            n4=new Circulo(700, 700, this, Color.parseColor("#3286D9")); //Coordernadas donde colocaremos nuestro circulo
            n4.mover(30, 30); //Que tan rapido movera el circulo

            n5=new Circulo(900, 1000, this, Color.parseColor("#AABF5D")); //Coordernadas donde colocaremos nuestro circulo
            n5.mover(40, 40); //Que tan rapido movera el circulo

        }

        @Override
        protected void onDraw(Canvas c) {
            super.onDraw(c);

            Paint p=new Paint();
            c.drawColor(Color.parseColor("#C7F6FD"));

            n1.pintar(c,p,100);  //parametros color|DrawCircle y radio

            n2.pintar(c,p,200);

            n3.pintar(c,p,50);

            n4.pintar(c,p, 80);

            n5.pintar(c,p, 120);
        }
}
