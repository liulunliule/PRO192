
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> arg0) {
        int result = 0;
        for (Brick brick : arg0) {
//			if (Character.isDigit(brick.getPlace().charAt(0)) == true && Character.isLetter(brick.getPlace().charAt(brick.getPlace().length()-1))==true) {
//				result++;
//			}

//Cach HNAM LAM
//            if (brick.getPlace().charAt(0) >= '0'&& (brick.getPlace().charAt(0) <= '9') ) {
//                if (brick.getPlace().charAt(1) >= 'A'&& (brick.getPlace().charAt(1) <= 'z') ) {
//                    result++;
//                }
//            }
            //NGTA LAM
            if (Character.isDigit(brick.getPlace().charAt(0)) == true && Character.isLetter(brick.getPlace().charAt(brick.getPlace().length() - 1)) == true) {
                result++;

            }
        }

        return result;
    }

    @Override
    public void f2(List<Brick> arg0) {
        int max = arg0.get(0).getPrice();
        int position = 0;
        for (int i = 0; i < arg0.size(); i++) {
            if (arg0.get(i).getPrice() > max && arg0.get(i).getPrice() % 2 == 1) {
                max = arg0.get(i).getPrice();
                position = i;
            }
        }
        arg0.get(position).setPlace("XX");

        //Kiểm tra xem phần tử hai số prime lớn nhất bằng nhau rồi đổi place thằng thứu hai thành XX (nghịch thêm)
//        for (int i = position + 1; i < arg0.size(); i++) {
//            if (arg0.get(position).getPrice() == arg0.get(i).getPrice()) {
//                  arg0.get(i).setPlace("XX");         
//            }
//        }
    }

    @Override
    public void f3(List<Brick> arg0) {
        // find the position of first brick having maximum 
        int max = arg0.get(0).getPrice();
        int position = 0;
        for (int i = 0; i < arg0.size(); i++) {
            if (arg0.get(i).getPrice() > max) {
                max = arg0.get(i).getPrice();
                position = i;
            }
        }
//cách HNAM làm
        for (int i = position; i < position; i--) {
            for (int j = position - 1; j < position; j--) {
                if (arg0.get(i).getPrice() < arg0.get(j).getPrice()) {
                    Collections.swap(arg0, i, j);
                }

            }
        }
        //ngta làm
        //sort all elements before it 
//        Collections.sort(arg0.subList(0, position), new Comparator<Brick>() {
//            
//            @Override
//            public int compare(Brick o1, Brick o2) {
//                
//                return o1.getPrice() - o2.getPrice();
//            }
//        });
    }

}
