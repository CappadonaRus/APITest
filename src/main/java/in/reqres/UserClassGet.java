package in.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserClassGet {

    private int page;

    private int per_page;
    private int total;
    private int total_pages;
    @JsonProperty("data")
    private List<Data> arrayList;
    @JsonProperty("ad")
    private Ad ad = new Ad();

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    public UserClassGet() {

    }

    public UserClassGet(int page, int per_page, int total, int total_pages, List<Data> arrayList, Ad ad) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.arrayList = arrayList;
        this.ad = ad;
    }

    public List<Data> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<Data> arrayList) {
        this.arrayList = arrayList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int perPage) {
        this.per_page = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }


    static class Data {
        private int id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;

        public Data() {
        }

        public Data(int id, String email, String first_name, String last_name, String avatar) {
            this.id = id;
            this.email = email;
            this.first_name = first_name;
            this.last_name = last_name;
            this.avatar = avatar;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }

    static class Ad {
        private String company;
        private String url;
        private String text;

        public Ad(String company, String url, String text) {
            this.company = company;
            this.url = url;
            this.text = text;
        }

        public Ad() {

        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    @Override
    public String toString() {
        return "UserClassGet{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", arrayList=" + arrayList +
                ", ad=" + ad +
                '}';
    }
}
