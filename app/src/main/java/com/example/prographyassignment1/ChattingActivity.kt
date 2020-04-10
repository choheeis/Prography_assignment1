package com.example.prographyassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_chatting.*


class ChattingActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var rvAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)

        initRecyclerView()

        iv_backArrow.setOnClickListener {
            finish()
        }
    }

    private fun initRecyclerView(){
        recyclerView = findViewById(R.id.chatting_rv)
        rvAdapter = ChatAdapter(this)
        recyclerView.adapter = rvAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        rvAdapter.data = listOf(
            ChatData(
                content = "안뇽"
            ),
            ChatData(
                content = "난 초히야"
            ),
            ChatData(
                content = "ㅂㅇ~"
            )
        )
        rvAdapter.notifyDataSetChanged()
    }


}
