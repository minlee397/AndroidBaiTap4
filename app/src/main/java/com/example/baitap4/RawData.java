package com.example.baitap4;

import java.util.ArrayList;
import java.util.List;

public class RawData {
    private List<Place> places;

    public RawData() {
        List<Place> places = new ArrayList<Place>();
        places.add(new Place(1, "Cu Chi Tunnels", "https://www.tripadvisor.com.vn/Attraction_Review-g293925-d2005826-Reviews-Cu_Chi_Tunnels-Ho_Chi_Minh_City.html", 11.1434467, 106.4644785));
        places.add(new Place(2, "Bảo Tàng Chứng Tích Chiến Tranh", "https://www.tripadvisor.com.vn/Attraction_Review-g293925-d311103-Reviews-War_Remnants_Museum-Ho_Chi_Minh_City.html", 10.7791637, 106.6924123));
        places.add(new Place(3, "Tháp Tài chính Bitexco", "https://www.tripadvisor.com.vn/Attraction_Review-g293925-d2037764-Reviews-Bitexco_Financial_Tower_Saigon_Skydeck-Ho_Chi_Minh_City.html", 10.7715903, 106.7045226));
        places.add(new Place(4, "Quảng trường Hồ Chí Minh", "https://www.tripadvisor.com.vn/Attraction_Review-g293925-d317893-Reviews-Ho_Chi_Minh_Squares-Ho_Chi_Minh_City.html", 18.670538, 105.690413));
        places.add(new Place(5, "Chợ Bến Thành", "https://www.tripadvisor.com.vn/Attraction_Review-g293925-d311087-Reviews-Ben_Thanh_Market-Ho_Chi_Minh_City.html", 10.772819, 106.698728));
        this.places = places;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
