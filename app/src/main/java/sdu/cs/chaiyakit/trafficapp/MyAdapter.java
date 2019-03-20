package sdu.cs.chaiyakit.trafficapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//Activity นี้สร้าง Layout เสมือน เพื่อนำไปแสดงผลบนหน้า MainActivity
public class MyAdapter extends BaseAdapter {
    //Explicit(ประกาศตัวแปร)
    Context context;
    int[]   ints; //ตัวแปรเก็บรูปโลโก้
    String[] titleString,detailString;  //titleString เก็บชื่อโลโก้  detailString เก็บรายละเอียดโลโก้

    public MyAdapter(Context context, int[] ints, String[] titleString, String[] detailString) {
        this.context = context;
        this.ints = ints;
        this.titleString = titleString;
        this.detailString = detailString;
    }

    @Override
    public int getCount() { //นับจำนวณข้อมูลที่ต้องการแสดงผล แล้วส่งต่อไปยัง method getView
        return ints.length;
    }

    @Override
    public Object getItem(int position) { //ไม่ได้ใช้ T.T ไม่สร้าง ERROR
        return null;
    }

    @Override
    public long getItemId(int position) { //ไม่ได้ใช้ T.T ไม่สร้าง ERROR
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) { //นำข้อมูลที่ได้จาก method getCount ไปแสดงผลบนหน้า App

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.my_listview,viewGroup,false); //inflate เป็นการดึงค่าจาก xml มาแสดงผลบน app

        //ผูกตัวแปรบน JAVA กับ XML
        ImageView iconImageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.textView2);
        TextView detailTextView1 = view1.findViewById(R.id.textView3);

        //show view นำข้อมูลไปแสดงผลบน app
        iconImageView.setImageResource(ints[i]);
        titleTextView.setText(titleString[i]);
        detailTextView1.setText(detailString[i]);
        return view1;
    }
}//end class
