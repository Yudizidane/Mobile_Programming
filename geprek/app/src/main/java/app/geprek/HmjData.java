package app.geprek;

import java.util.ArrayList;

public class HmjData {
    public static String[][] data = new String[][]{
            {"0",
                    "Geprek Ori",
                    "Geprek Ori adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang.",
                    "https://assets-pergikuliner.com/yqJttiuBsBulN_JGthwiRLSXXZk=/385x290/smart/https://assets-pergikuliner.com/uploads/image/picture/1166174/picture-1543230930.JPEG"},
            {"1",
                    "Geprek Teriyaki",
                    "Ayam geprek Teriyaki adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang dan ditambah dengan bumbu Teriyaki asal Jepang.",
                    "https://assets.grab.com/wp-content/uploads/sites/9/2019/05/08133048/Geprek-Bensu-blog4-700x393.jpg"},
            {"2",
                    "Geprek non Geprek",
                    "Ayam geprek non Geprek adalah sajian ayam goreng tepung krispi yang tidak digeprek.",
                    "https://kurio-img.kurioapps.com/18/09/20/6e52be28-24a1-4a76-b71a-41a0954fbd4e.jpg"},
            {"3",
                    "Geprek Nasi Rendang",
                    "Ayam geprek Nasi Rendang adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang dan disajikan dengan nasi bumbu rendang khas Padang",
                    "https://1.bp.blogspot.com/-iYj4CHbmzK0/XOej9RhJTtI/AAAAAAAAE2M/avUHF366zuYMK-Jrfrh2sFRU3G6ughD6ACLcBGAs/s640/2019-05-24%2B10.20.37%2B1.jpg"},
            {"4",
                    "Geprek Nasi Limao",
                    "Ayam geprek Nasi Limao adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang dan disajikan dengan nasi beraroma Limao atau jeruk nipis",
                    "https://cdn-cas.orami.co.id/parenting/images/kulben1.width-800.jpg"},
            {"5",
                    "Geprek Sambal Matah",
                    "Ayam geprek Sambal Matah adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal Matah khas Bali.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShZiq74seDPTseyrNjRPWfneeFyxqFNFdYnRCFPb5sCaYIyaxn&s"},
            {"6",
                    "Geprek Mozarella",
                    "Ayam geprek Mozarella adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama keju khas Jerman Mozarella",
                    "https://assets-pergikuliner.com/-9VX4HfWdFvkPXQEKkAeDODz2-c=/385x290/smart/https://assets-pergikuliner.com/uploads/image/picture/1089296/picture-1537983962.jpg"},
            {"7",
                    "Geprek Mozarella Ngapak",
                    "Ayam geprek Mozarella Ngapak adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang dan diberikan secacah Mendoan Anget",
                    "https://cdn2.tstatic.net/style/foto/bank/images/geprek-keju-ala-bensu_20171214_165842.jpg"},
            {"8",
                    "Geprek Indomie Goreng",
                    "Ayam geprek Indomie Goreng adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang dan disajikan dengan Indomie Goreng khas Indonesia",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7yMCob1AaAvRepPejLQLbf4Uisz6MuGl-Gb_ZNR3gt3jJ05fu&s"},
            {"9",
                    "Geprek Kacang Mede",
                    "Ayam geprek Indomie Goreng adalah sajian ayam goreng tepung krispi yang kemudian digeprek atau dipenyet bersama sambal bawang plus Kacang Mede khas Surabaya",
                    "https://blog.lakupon.com/wp-content/uploads/2017/09/16229399_1373407239346093_2798154043539587072_n.jpg"}};



    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);
            list.add(hmj);
        }
        return list;
    }
}
