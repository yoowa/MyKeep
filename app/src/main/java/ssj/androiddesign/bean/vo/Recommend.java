package ssj.androiddesign.bean.vo;


import ssj.androiddesign.bean.vo.ChildRocommend;

/**
 * 计事对象
 * @author zhiwu_yan
 * @since 2015年06月11日
 */
public class Recommend {

    public String timeTitle;
    public ChildRocommend childRocommend;
    public Recommend(ChildRocommend childRocommend,String timeTitle){
        this.childRocommend=childRocommend;
        this.timeTitle=timeTitle;
    }
}