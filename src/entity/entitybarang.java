package entity;

public class entitybarang extends entity_barang{
    private int harga;
    private int stok;

    public entitybarang(int kodeBarang, String nama, int harga, int stok)
    {
        super(kodeBarang, nama);
        this.harga = harga;
        this.stok = stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public void cetak()
    {
        super.cetak();
        System.out.println("harga barang    : "+this.harga);
        System.out.println("stok barang     : "+this.stok);
    }

}