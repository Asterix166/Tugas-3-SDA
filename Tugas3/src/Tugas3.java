import java.util.LinkedList;

public class Tugas3 {
    public static void main(String[] args) {
        System.out.println("\nFahri Andika Sanjaya");
        System.out.println("2111523006");
        System.out.println("=============================");

        //Buat linkedlist
        LinkedList<String> nim = new LinkedList<>();
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        nim.add("2111523006");

        nama.add("Fahri");

        alamat.add("Padang");

        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output Nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output Alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================");  

        //Menambahkan Elemen
        nim.add(1,"2211523006");
        nim.add(2,"2011523006");
        nim.addLast("2111523006");

        nama.add(1,"Andika");
        nama.add(2,"Hilmi");
        nama.addLast("Sanjaya");

        alamat.add(1,"Pariaman");
        alamat.add(2,"Padang");
        alamat.addLast("Padang Pariaman");

        System.out.println("...::Menambah Elemen::...");
        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output Nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output Alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================");

        //Menyisipkan Elemen
        nim.set(0,"2211523006");
        nim.set(1,"2311523006");
        nim.set(2,"2411523006");

        nama.set(0,"Andika");
        nama.set(1,"Sanjaya");
        nama.set(2,"Fahri");

        alamat.set(0,"Pariaman");
        alamat.set(1,"Padang Pariaman");
        alamat.set(2,"Padang");

        System.out.println("...::Menyisipkan Elemen::...");
        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output Nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output Alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================");

        //Menghapus Elemen
        //First dan Last
        nama.removeFirst();
        nama.removeLast();
        alamat.removeFirst();
        alamat.removeLast();
        nim.removeFirst();
        System.out.println("...::Menghapus Elemen::...");
        System.out.println("Hapus First dan Last");
        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output Nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output Alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("");
        //Berdasarkan Index
        nama.remove(1);
        alamat.remove(0);
        nim.remove(0);
        System.out.println("Hapus Elemen Index");
        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output Nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output Alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================");

        //POP dan PUSH
        nama.push("Fahri Andika");
        nim.pop();
        System.out.println("...::POP dan PUSH::...");
        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output Nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output Alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================");
        
    }
}