package com.oho.listmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Makanan> dataMkn;
    private RecyclerView listMkn;
    private MknAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();//call
        listMkn = (RecyclerView) findViewById(R.id.id_mkn);
        adapter = new MknAdapter(this, dataMkn);
        listMkn.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listMkn.setLayoutManager(layoutManager);

        DividerItemDecoration divider = new DividerItemDecoration(listMkn.getContext(),
                layoutManager.getOrientation());
        listMkn.addItemDecoration(divider);

    }

    private void generateData() {
        dataMkn = new ArrayList<>();

        String[] title = {
                "Gulai Kambing",
                "Donat Kentang",
                "Risoles isi Sayur",
                "Risoles Kentang Pastry"
        };

        String[] desc = {
                "Resep Gulai Kambing sangat Cocok Untuk diaplikasikan untuk anda yang bingung " +
                        "ingin memasak menu makananan apa saat ini",
                "Resep Donat Kentang yang sudah kami sajikan merupakan resep yang sederhana dan " +
                        "praktis sehingga bisa diterapkan oleh siapa saja yang ingin mencoba " +
                        "membuatnya sendiri",
                "Resep dan Membuat Risoles isi sayur ini tidak sulit, selain itu isi dan rasa " +
                        "juga bisa disesuaikan dengan selera masing-masing",
                "Resep Risoles Kentang Pastry, anda tentu tidak asing lagi dengan pastry " +
                        "nusantara satu ini, Risoles adalah Kue dengan dadaran yang terbuat dari " +
                        "tepung"
        };

        String[] bahan = {
                "500 gram tepung terigu protein tinggi\n" +
                "250 gram kentang, kukus, haluskan dan dinginkan\n" +
                "50 gram susu bubuk fullcream\n" +
                "1 bungkus/ 11 gram ragi instant\n" +
                "100 gram gula halus\n" +
                "75 gram mentega\n" +
                "½ sdt garam\n" +
                "4 butir kuning telur\n" +
                "100 ml air dingin\n",

                "500 gram tepung terigu protein tinggi\n" +
                "250 gram kentang, kukus, haluskan dan dinginkan\n" +
                "50 gram susu bubuk fullcream\n" +
                "1 bungkus/ 11 gram ragi instant\n" +
                "100 gram gula halus\n" +
                "75 gram mentega\n" +
                "½ sdt garam\n" +
                "4 butir kuning telur\n" +
                "100 ml air dingin\n",

                "100 gram tepung terigu protein sedang\n" +
                "1 butir telur\n" +
                "250 ml susu cair\n" +
                "¼ sdt garam\n" +
                "1 sdm margarin, lelehkan, biarkan dingin\n",

                "200 ml air\n" +
                "125 gr margarine\n" +
                "1 sdm gula pasir\n" +
                "150 gr tepung terigu cakra\n" +
                "4 btr telur"
        };

        String[] prosedur = {
                "1.Pertama Tumis bumbu yang dihaluskan, masukan juga cengkeh, pala, kayumanis, " +
                        "kapulaga sampai harum.\n" +
                "2.Kemudian Masukkan daging kambing, aduk aduk sampai berubah warnanya. lalu " +
                        "Tuangkan santan encer dan rebus hingga daging kambing lunak.\n" +
                "3.Terakhir masukan santan kental. biarkan Tunggu sampai bumbu meresap, periksa " +
                        "keempukan daging, angkat, selesai.\n" +
                "4.Untuk melengkapi makanan ini sangat enak ditemani acar (ketimun dan wortel),\n",

                "1.Campurkan tepung terigu, gula, susu bubuk, dan ragi instant, menjadi satu lalu" +
                        " aduk rata. Masukkan kentang halus, aduk sampai rata.\n" +
                "2.Masukkan kuning telur dan air dingin, uleni hingga rata dan setengah kalis. " +
                        "Tambahkan mentega dan garam, uleni terus hingga kalis elastis. Diamkan selama 15 menit.\n" +
                "3.Bentuk adonan menjadi bulat atau sesuai selera. Diamkan selama 20 menit, " +
                        "sampai terlihat mengembang.\n" +
                "4.Jika ingin berlubang, buat lubang kecil di tengah lalu goreng dengan minyak " +
                        "panas di atas api sedang hingga kuning keemasan. Gunakan sumpit kayu atau bahan yang tidak mudah meleleh saat donat mulai mengembang, masukkan sumpit di tengah lubang kecil donat sambil digoyang dengan berputar-putar sehingga lubang membesar dan rata.\n" +
                "5.Angkat dan tiriskan lalu hiasi dengan topping gula halus, coklat leleh, " +
                        "meises, " +
                        "keju atau aneka toping lainnya.\n",

                "1.Campurkan bahan kulit, yaitu tepung terigu, telur, susu cair dan garam, aduk " +
                        "rata. Saring lalu masukkan margarin cair, aduk rata. Siapkan wajan anti lengket, lalu ambil sedikit adonan dan buat dadar. Sisihkan\n" +
                "2.Untuk isi risoles, tumis bawang putih dan bawang merah sampai harum. Tambahkan" +
                        " kentang, wortel dan buncis. Aduk hingga layu, tuangkan air, masukkan garam, merica, pala bubuk dan gula. Masak sampai bumbu meresap, tambahkan seledri, aduk rata kembali.\n" +
                "3.Ambil selembar kulit, beri isi lipat dan gulung. Celupkan gulungan risoles ke " +
                        "dalam telur lalu gulingkan ke tepung panir. Masukkan ke dalam kulkas biarkan sekitar 2 jam.\n" +
                "4.Panaskan minyak, goreng risoles hingga matang dan berwarna coklat " +
                        "kekuningan. Angkat, tiriskan dan siap untuk dihidangkan.\n",

                "1.Jangan membuka oven selama memanggang, karena akan mengakibatkan kulit tidak " +
                        "kokoh.\n" +
                "2.Timing yang tepat sangat penting untuk mendapatkan kulit yang kokoh dan tidak " +
                        "melembek ketika dingin. Kalau sudah lewat 25 menit di permukaan kue masih ada mentega berbuih-buih, jangan dikeluarkan dulu dari oven. Tunggu sampai sudah tidak ada buih mentega lagi yang keluar, baru angkat kue dari oven.\n" +
                "3.Setelah dikeluarkan dari oven, segera pindahkan kue sus ke rak kawat, supaya " +
                        "bagian bawahnya tidak beruap dan malah jadi lembek. Kalau tidak ada rak kawat, cari cara supaya bagian bawahnya bisa kontak langsung dengan udara.\n" +
                "4.Tusuk-tusuk kue sus dengan tusuk gigi di beberapa tempat setelah dikeluarkan " +
                        "dari oven untuk memudahkan keluarnya uap air.\n" +
                "5.Cara mengisi kue sus: gunting sedikit kulitnya, semprotkan isi dengan " +
                        "menggunakan plastik segitiga. Sruuutt….!\n"
        };

        int[] img = {
                R.drawable.img,
                R.drawable.menu_gofood,
                R.drawable.menu_gomart,
                R.drawable.menu_goride
        };

        for (int i = 0; i < title.length; i++){
            Makanan makanan = new Makanan(title[i],desc[i],bahan[i],prosedur[i],img[i]);

            dataMkn.add(makanan);
        }
    }
}
