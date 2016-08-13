package com.rogrand.buynew.domain;
import com.rogrand.core.annotation.FieldAnnotation;
import com.rogrand.core.domain.Base;
import java.util.Date;

/**
 * 版权：LAB <br/>
 * 作者：dailing <br/>
 * 生成日期：2016-08-02 <br/>
 * 描述：品牌馆类
 */
public class Venue extends Base {

    @FieldAnnotation(comment = "id", exp = false, imp = false, empty = true, len = 10, pk = true)
    private Long id;

    @FieldAnnotation(comment = "品牌馆名称", exp = true, imp = true, empty = true, len = 20)
    private String name;

    @FieldAnnotation(comment = "品牌馆图片", exp = true, imp = true, empty = true, len = 200)
    private String image;

    @FieldAnnotation(comment = "置顶时间", exp = true, imp = true, empty = true)
    private Date stick_time;

    @FieldAnnotation(comment = "创建时间", exp = true, imp = true, empty = true)
    private Date create_time;

    @FieldAnnotation(comment = "创建人", exp = true, imp = true, empty = true, len = 20)
    private String create_user;

    @FieldAnnotation(comment = "更新时间", exp = true, imp = true, empty = true)
    private Date update_time;

    @FieldAnnotation(comment = "更新人", exp = true, imp = true, empty = true, len = 20)
    private String update_user;


    /**
     * 品牌馆对象构造函数
     */
    public Venue() {
        super();
    }

    public Venue(String id) {
        this("id",id);
    }

    public Venue(String property, Object value) {
        this();
        init(property, value);
    }

    /**
     * 获得id
     * @return Long
     */
    public Long getId(){
        return this.id;
    }

    /**
     * 设置id
     * @param id  id
     */
    public void setId(Long id){
        putField("id");
        this.id = id;
    }
    /**
     * 获得品牌馆名称
     * @return String
     */
    public String getName(){
        return this.name;
    }

    /**
     * 设置品牌馆名称
     * @param name  品牌馆名称
     */
    public void setName(String name){
        putField("name");
        this.name = name;
    }
    /**
     * 获得品牌馆图片
     * @return String
     */
    public String getImage(){
        return this.image;
    }

    /**
     * 设置品牌馆图片
     * @param image  品牌馆图片
     */
    public void setImage(String image){
        putField("image");
        this.image = image;
    }
    /**
     * 获得置顶时间
     * @return Date
     */
    public Date getStick_time(){
        return this.stick_time;
    }

    /**
     * 设置置顶时间
     * @param stick_time  置顶时间
     */
    public void setStick_time(Date stick_time){
        putField("stick_time");
        this.stick_time = stick_time;
    }
    /**
     * 获得创建时间
     * @return Date
     */
    public Date getCreate_time(){
        return this.create_time;
    }

    /**
     * 设置创建时间
     * @param create_time  创建时间
     */
    public void setCreate_time(Date create_time){
        putField("create_time");
        this.create_time = create_time;
    }
    /**
     * 获得创建人
     * @return String
     */
    public String getCreate_user(){
        return this.create_user;
    }

    /**
     * 设置创建人
     * @param create_user  创建人
     */
    public void setCreate_user(String create_user){
        putField("create_user");
        this.create_user = create_user;
    }
    /**
     * 获得更新时间
     * @return Date
     */
    public Date getUpdate_time(){
        return this.update_time;
    }

    /**
     * 设置更新时间
     * @param update_time  更新时间
     */
    public void setUpdate_time(Date update_time){
        putField("update_time");
        this.update_time = update_time;
    }
    /**
     * 获得更新人
     * @return String
     */
    public String getUpdate_user(){
        return this.update_user;
    }

    /**
     * 设置更新人
     * @param update_user  更新人
     */
    public void setUpdate_user(String update_user){
        putField("update_user");
        this.update_user = update_user;
    }
}