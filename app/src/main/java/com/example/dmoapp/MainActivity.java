package com.example.dmoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;


class info{
   public int units;
    public String name;
 public    info(int u,String n){
     this.units=u;
     this.name=n;
    }
}


class genre {
    String Mystery[];
    String Fantasy[];
    String Thriller[];

     public void genre(String genre,String name){
        if(genre.equals("Mystery")){
           int a= Mystery.length;
           Mystery[a+1]=name;
        }

        else  if(genre.equals("Fantasy")){
            int a= Fantasy.length;
            Fantasy[a+1]=name;
        }

      else   if(genre.equals("Thriller")){
            int a= Thriller.length;
            Thriller[a+1]=name;
        }
    }

    public void show_book_info(String genre) {
        if (genre.equals("Mystery")) {
            for (int i = 0; i < Mystery.length; i++) {
                System.out.println(Mystery[i] + "\n");
            }
        } else if (genre.equals("Fantasy")) {
            for (int i = 0; i < Fantasy.length; i++) {
                System.out.println(Fantasy[i] + "\n");
            }
        } else if (genre.equals("Thriller")) {
            for (int i = 0; i < Thriller.length; i++) {
                System.out.println(Thriller[i] + "\n");
            }
        }
    }}




    class book{
       String title;
       String  author;

       genre  g=new genre();
       public void add_book(String title,String author,String genre,int units){
           g.genre("genre","title");
       }

       public void borrow_book(String title,int units){


       }



    }








class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        
    }


    }