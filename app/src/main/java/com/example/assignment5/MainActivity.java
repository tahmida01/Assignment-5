package com.example.assignment5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView bookRecyclerView = findViewById(R.id.bookRecyclerView);

        List<Book> books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", R.drawable.book_1));
        books.add(new Book("1984", "George Orwell", R.drawable.book_2));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", R.drawable.book_3));
        books.add(new Book("Moby Dick", "Herman Melville", R.drawable.book_4));
        books.add(new Book("Pride and Prejudice", "Jane Austen", R.drawable.book_5));
        books.add(new Book("The Book Thief", "Markus Zusak", R.drawable.book_6));
        books.add(new Book("The Outsiders", "S.E. Hinton", R.drawable.book_7));
        books.add(new Book("Turtles All the Way Down", "John Green", R.drawable.book_8));
        books.add(new Book("Harry Potter", " J.K. Rowling", R.drawable.book_9));
        books.add(new Book("Wonder", "R.J. Palacio", R.drawable.book_10));
        books.add(new Book("The Giver", "Lois Lowry", R.drawable.book_11));
        books.add(new Book("Holes", " Louis Sachar", R.drawable.book_12));

        BookAdapter adapter = new BookAdapter(this, books);
        bookRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        bookRecyclerView.setAdapter(adapter);
    }
}
