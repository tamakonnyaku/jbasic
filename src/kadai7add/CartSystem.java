package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {
    // 商品情報保存リスト（フィールド）
    private static List<Item> cart = new ArrayList<Item>();
    // スキャナークラス（フィールド）
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int no = 0;
        Item a = new Item("",0);
        Book b = new Book("",0,"");

        while (true) {

            System.out.println("1.商品追加\n2.書籍追加\n3.情報更新\n9.終了");
            System.out.print("メニューを選択してください：");
            int select = scan.nextInt();  // 変数名 selct を select に修正

            if (select == 1) {
                System.out.println("商品をカートに追加します");
                System.out.print("商品名を入力してください：");
                String name = scan.next(); // 名前の入力
                System.out.print("価格を入力してください：");
                int price = scan.nextInt(); // 価格の入力
                cart.add(new Item(name, price));
                System.out.println("No.　　商品情報");
                System.out.println("-------------------");
                for (Item data : cart) {
                    no++;
                    System.out.println(no + "　　" + data.getInfo());
                }
                System.out.println("-------------------");
                no = 0;
            } else if (select == 2) {
                System.out.println("書籍をカートに追加します");
                System.out.print("書籍名を入力してください：");
                String name = scan.next(); // 名前の入力
                System.out.print("著者を入力してください：");
                String author = scan.next(); // 著者の入力
                System.out.print("価格を入力してください：");
                int price = scan.nextInt(); // 価格の入力
                cart.add(new Book(name, price, author));
                System.out.println("No.　　商品情報");
                System.out.println("-------------------");
                for (Item data : cart) {
                    no++;
                    System.out.println(no + "　　" + data.getInfo());
                }
                System.out.println("-------------------");
                no = 0;

            } else if (select == 3) {
                System.out.println("情報を更新します");
                System.out.print("No.を入力してください：");
                int nb = scan.nextInt(); // No.の入力
                for (Item data : cart) {

                    if (cart.size() < nb) {
                        System.out.println("選択されたNo.はありません");
                        break;
                    }
                    if (no + 1 == nb) {
                        if (cart.get(no).getClass() == a.getClass()) {
                            System.out.print("商品名を入力してください(現在：" + cart.get(no).getName() + ")：");
                            String name = scan.next(); // 名前の入力
                            System.out.print("価格を入力してください(現在：" + cart.get(no).getPrice() + ")：");
                            int price = scan.nextInt(); // 価格の入力
                            cart.set(no, new Item(name, price));
                        } else if (cart.get(no).getClass() == b.getClass()) {
                            System.out.print("書籍名を入力してください(現在：" + cart.get(no).getName() + ")：");
                            String name = scan.next(); // 名前の入力
                            System.out.print("著者を入力してください(現在：" + ((Book) cart.get(no)).getAuthor() + ")：");
                            String author = scan.next(); // 著者の入力
                            System.out.print("価格を入力してください(現在：" + cart.get(no).getPrice() + ")：");
                            int price = scan.nextInt(); // 価格の入力
                            cart.set(no, new Book(name, price, author));
                        }
                    }
                    no++;
                }
                no = 0;
                System.out.println("No.　　商品情報");
                System.out.println("-------------------");
                for (Item data : cart) {
                    no++;
                    System.out.println(no + "　　" + data.getInfo());
                }
                System.out.println("-------------------");
                no = 0;
            } else if (select == 9) {
                System.out.println("終了します");
                break;
            }
        }
    }
}
