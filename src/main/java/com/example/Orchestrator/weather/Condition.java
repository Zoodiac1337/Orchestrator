package com.example.Orchestrator.weather;

public class Condition {
    private String text;
    private String icon;
    private long code;

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }

    public String getIcon() { return icon; }
    public void setIcon(String value) { this.icon = value; }

    public long getCode() { return code; }
    public void setCode(long value) { this.code = value; }
}