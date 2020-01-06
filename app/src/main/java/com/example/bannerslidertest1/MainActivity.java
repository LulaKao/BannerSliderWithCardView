package com.example.bannerslidertest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null; // 改變背景色
    ArgbEvaluator argbEvaluator = new ArgbEvaluator(); // 漸變色效果


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化元件
        viewPager = findViewById(R.id.viewPager);

        // 設置 banner 的圖片
        models = new ArrayList<>();
        models.add(new Model(R.drawable.bb));
        models.add(new Model(R.drawable.bn));
        models.add(new Model(R.drawable.bn2));
        models.add(new Model(R.drawable.video));

        // 設置 Adapter
        adapter = new Adapter(models,this);
        viewPager.setAdapter(adapter);

        // 設置 banner 彼此之間的間距
        viewPager.setPadding(60,0,60,0);

//        //--- 設置背景色 START ---//
//        Integer[] colors_temp = {
//                getResources().getColor(R.color.color1),
//                getResources().getColor(R.color.color2),
//                getResources().getColor(R.color.color3),
//        };
//
//        colors = colors_temp;
//        //--- 設置背景色 END ---//
//
//        //--- 讓背景色隨著換頁而改變 START ---//
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                if(position < (adapter.getCount() - 1) && position < (colors.length - 1)){
//                    viewPager.setBackgroundColor(
//                            (Integer)argbEvaluator.evaluate(
//                                    positionOffset,
//                                    colors[position],
//                                    colors[position + 1]
//                            )
//                    );
//                }else {
//                    viewPager.setBackgroundColor(colors[colors.length - 1]);
//                }
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//        //--- 讓背景色隨著換頁而改變 END ---//
    }
}
