package com.example.justyna.clientsmanager.acitivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.justyna.clientsmanager.R;
import com.example.justyna.clientsmanager.recycler.RecyclerView;
import com.example.justyna.clientsmanager.recycler.RecyclerViewAdapter;
import com.example.justyna.clientsmanager.recycler.RecyclerViewLayoutManager;
import com.example.justyna.clientsmanager.views.adapters.UsersAdapter;

public class UsersActivity extends AppCompatActivity {

    private ListView listView;
    private UsersAdapter usersAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;
    private RecyclerViewLayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        getSupportActionBar().setTitle("List of users");

        mRecyclerView = (RecyclerView) findViewById(R.id.user_list);



        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new RecyclerViewAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);


        listView = (ListView) findViewById(R.id.user_list);
        usersAdapter = new UsersAdapter(getApplicationContext(), this);
        listView.setAdapter(usersAdapter);

    }

}
