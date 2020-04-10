package com.example.prographyassignment1


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.fragment_mypage.*


class MypageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /** App Bar 투명도 설정 */
        mypage_appBar.alpha = 0f
        mypage_scrollView.setOnScrollChangeListener { v: NestedScrollView?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int ->
            if(scrollY == 0){
                mypage_appBar.alpha = 0f
            }else{
                mypage_appBar.alpha = 1f
            }
        }

        /** 고객센터 클릭시 화면 전환 */
        btn_customerCenter.setOnClickListener {
            val intent = Intent(activity, CustomerCenterActivity::class.java)
            startActivity(intent)
        }
    }

}
