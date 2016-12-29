package com.example.pr_idi.mydatabaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private BookData bookData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        bookData = new BookData(this);
        bookData.open();
        List<Book> values = bookData.getAllBooks();

        Book book = new Book();
        book = bookData.createBook("Ring Men", "Rowling");
        values.add(book);



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        //els numero de items del recycler es dinamic per aixo fico false
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(values));
    }

}
