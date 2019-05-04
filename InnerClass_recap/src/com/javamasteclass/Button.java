package com.javamasteclass;

public class Button {

    private String title;
    private OnClickListner onClickListner;

    public Button(String title) {
        this.title = title;
        this.onClickListner = onClickListner;
    }

    //getter
    public String getTitle() {
        return title;
    }

    //setter
    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }

    public void onClick(){
        this.onClickListner.onClick(this.title);
    }
    public interface OnClickListner {
        public void onClick(String title);
    }
}
