package com.example.pr_idi.mydatabaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lista_mensajes);
        //els numero de items del recycler es dinamic per aixo fico false
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getList()));
    }

    private List<Book> getList () {
        Book book = new Book();
        book.setId(123);
        book.setAuthor("jkrowling");
        book.setTitle("señor anillos");
        List <Book> list = new ArrayList<>();
        list.add(book);
        list.add(book);
        list.add(book);
        return list;
    }
}
