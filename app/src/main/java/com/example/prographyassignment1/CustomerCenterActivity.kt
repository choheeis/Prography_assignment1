package com.example.prographyassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_customer_center.*

class CustomerCenterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_center)

        /** 뒤로가기 버튼 클릭시 Activity Finish */
        iv_backArrow.setOnClickListener {
            finish()
        }

        /** 채팅 서비스 클릭시 채팅 Activity로 전환 */
        btn_chatting.setOnClickListener {
            val intent = Intent(this, ChattingActivity::class.java)
            startActivity(intent)
        }
    }
}
