package Homework_04_04.Task_6;

import java.util.Objects;

public class Button {
    private String textButton;
    private String colorButton;
    private int widthButton;
    private int heightButton;
    private statusButton status;
    public enum statusButton{
        Default,
        Hover,
        OnClick;
    }

    public void setTextButton(String text){
        this.textButton = text;
    }

    public void setColorButton(String color){
        this.colorButton = color;
    }

    public void setWidthButton(int width){
        this.widthButton = width;
    }

    public void setHeightButton(int height){
        this.heightButton = height;
    }

    public void setStatusButton(statusButton status){
        this.status = status;
    }

    public String getTextButton(){
        return textButton;
    }

    public String getColorButton(){return colorButton; }

    public int getWidthButton(){return widthButton; }

    public int getHeightButton(){return heightButton; }

    public statusButton getStatusButton(){return status; }

    public Button(){}

    public Button(String name){
        this.textButton = name;
    }

    public Button(String name, String color){
        this.textButton = name;
        this.colorButton = color;
    }

    public Button (String name, String color, int width, int height){
        this.textButton = name;
        this.colorButton = color;
        this.widthButton = width;
        this.heightButton = height;
    }

    public Button (String name, String color, int width, int height, statusButton status){
        this.textButton = name;
        this.colorButton = color;
        this.widthButton = width;
        this.heightButton = height;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Button{" +
                "textButton='" + getTextButton() + '\'' +
                ", colorButton='" + getColorButton() + '\'' +
                ", widthButton=" + getWidthButton() +
                ", heightButton=" + getHeightButton() +
                ", status=" + getStatusButton() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Button)) return false;
        Button button = (Button) o;
        return getWidthButton() == button.getWidthButton() && getHeightButton() == button.getHeightButton() && Objects.equals(getTextButton(), button.getTextButton()) && Objects.equals(getColorButton(), button.getColorButton()) && status == button.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTextButton(), getColorButton(), getWidthButton(), getHeightButton(), status);
    }
}
