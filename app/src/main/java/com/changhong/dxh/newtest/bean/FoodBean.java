package com.changhong.dxh.newtest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.changhong.dxh.newtest.BR;

/**
 * @PackageName:com.changhong.dxh.newtest.bean
 * @ClassNmae:
 * @Description:
 * @Athor: rosalind
 * @Email: xiaohong.deng@changhong.com
 * @Date： 20182018/6/27 16:47
 */
public class FoodBean extends BaseObservable{
    private final ObservableField<String> describ=new ObservableField<>();
    private ObservableField<String> imgUrl=new ObservableField<>();
    private ObservableField<String> keywords=new ObservableField<>();
    private ObservableField<String> summary=new ObservableField<>();

    public FoodBean(String describ, String imgUrl, String keywords, String summary) {
        this.describ .set(describ);
        this.imgUrl.set (imgUrl);
        this.keywords.set(keywords) ;
        this.summary.set(summary) ;
    }


    @BindingAdapter({"img"})
    public static void loadInternetImage(ImageView img, String imgUrl)
    {
        Glide.with(img.getContext()).load(imgUrl).into(img);
    }
    @Bindable
    public String getDescrib() {
        return describ.get();
    }

    public void setDescrib(String describ) {
        this.describ.set(describ);
        notifyPropertyChanged(BR.describ);
    }

    public String getImgUrl() {
        return imgUrl.get();
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl.set(imgUrl);
    }

    public String getKeywords() {
        return keywords.get();
    }

    public void setKeywords(String keywords) {
        this.keywords.set(keywords);
    }

    public String getSummary() {
        return summary.get();
    }

    public void setSummary(String summary) {
        this.summary.set(summary);
    }
    public void onItemClick(View view)
    {
        setDescrib("change the data in setDescrib()");
    }

    public void clickKeywords(View view)
    {
        Toast.makeText(view.getContext(), getKeywords(), Toast.LENGTH_SHORT).show();
    }
}
