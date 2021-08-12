package Services;

import Models.SanPham;

import java.util.ArrayList;

public class SanPhamService {
    public ArrayList<SanPham> list = new ArrayList<>();
    public SanPhamService(){
        list.add(new SanPham(1, "Xanh", 50, 5, "Xanh", "no", "no"));
    }

    public void  add(SanPham sanPham){
        list.add(sanPham);
    }
    public void edit(SanPham sanPham, int index){
        list.set(index, sanPham);
    }
    public void delete(int index){
        list.remove(index);
    }
    public ArrayList<SanPham> find(String name){
        ArrayList<SanPham> listSP = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(name.equals(list.get(i).getName())){
                listSP.add(list.get(i));
            }
        }
        return listSP;
    }
}
