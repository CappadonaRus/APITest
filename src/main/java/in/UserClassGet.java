import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserClassGet {

    private int page;
    @JsonProperty("per_page")
    private int perPage;
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
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

    public UserClassGet(int page, int perPage, int total, int totalPages, List<Data> arrayList, Ad ad) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
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
        return perPage;
    }

    public void setPer_page(int perPage) {
        this.perPage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }


    static class Data {
        private int id;
        private String email;

        private String first_name;
        private String last_name;
        private String avatar;

        public Data() {
        }

        public Data(int id, String email, String firstName, String lastName, String avatar) {
            this.id = id;
            this.email = email;
            this.first_name = firstName;
            this.last_name = lastName;
            this.avatar = avatar;
        }

        public String getFirstName() {
            return first_name;
        }

        public void setFirstName(String firstName) {
            this.first_name = firstName;
        }

        public int getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLastName() {
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

        public void setId(int id) {
            this.id = id;
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
        return "UserClass{" +
                "page=" + page +
                ", per_page=" + perPage +
                ", total=" + total +
                ", total_pages=" + totalPages +
                ", arrayList=" + arrayList +
                ", ad=" + ad +
                '}';
    }
}
