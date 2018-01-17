package dengyuxi.example.furious.windowapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by Lenovo on 2017/12/18.
 */
@SuppressWarnings("ALL")
public class clock extends Activity{
    private DatePicker mydp = null;
    private TimePicker mytp = null;
    @Override
    public void onCreate(Bundle savedlnstancesState){
        super.onCreate(savedlnstancesState);//调用父类onCreate()方法
        setContentView(R.layout.colock);
        super.setContentView(R.layout.colock);//调用布局文件
        this.mydp=(DatePicker)super.findViewById(R.id.date);//取得日期选择器
        this.mydp.updateDate(2018,1,1);//设置一个默认日期
        this.mytp=(TimePicker)super.findViewById(R.id.time);//取得时间选择器
        this.mytp.setIs24HourView(true);//设置为24小时制
        this.mytp.setCurrentHour(18);//设置小时
        this.mytp.setCurrentMinute(30);//设置分钟

    }
}
