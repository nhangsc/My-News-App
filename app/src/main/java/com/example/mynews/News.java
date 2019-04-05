package com.example.mynews;

class News {
    private String mTitle;
    private String mDate;
    private String mSection;
    private String mAuthor;
    private String mUrl;

    News(String Title, String Section, String Date, String Url, String Author) {
        this.mTitle = Title;
        this.mDate = Date;
        this.mSection = Section;
        this.mAuthor = Author;
        this.mUrl = Url;
    }

    String getTitle() { return mTitle; }
    String getDate() { return mDate; }
    String getSection() { return mSection; }
    String getAuthor() { return mAuthor; }
    String getUrl() {
        return mUrl;
    }

}
