public class RubFormatter  {

    /*float perPrice;
     String rubl;
     RubFormatter (float persPrice) {
         perPrice = persPrice;
         int rubPrice;

              rubPrice = (int) persPrice;
             int priceEnd = rubPrice % 100; //Остаток от деления на 100 для учёта 11 - 20 рублей
             if (priceEnd > 4 && priceEnd < 21) {
                 rubl = "рублей";
             } else {
                 int priceEndEnd = priceEnd % 10; //Остаток от деления на 10 для остальных случаев
                 if (priceEndEnd == 1) {
                     rubl = "рубль";
                 } else if (priceEndEnd > 1 && priceEndEnd < 5) {
                     rubl = "рубля";
                 } else {
                     rubl = "рублей";
                 }

         }
     }
 */
    //в комментариях старая версия метода
    static String rubFormatter(float cost) {
        int rubPrice;
        rubPrice = (int) cost; //привели итог к целочисленному значению

        int priceEnd = rubPrice % 100; //Остаток от деления на 100 для учёта 11 - 20 рублей
        if (priceEnd > 4 && priceEnd < 21) {
            return "рублей";
        } else {
            int priceEndEnd = priceEnd % 10; //Остаток от деления на 10 для остальных случаев
            if (priceEndEnd == 1) {
                return "рубль";
            } else if (priceEndEnd > 1 && priceEndEnd < 5) {
                return "рубля";
            } else {
                return "рублей";
            }
        }
    }


}
