package lesson2.AgregCompose;

public class main {
    public static void main(String[] args) {
        //заповнення вложеності
        // три варіка
        //1-- заздалегіть (обєкт компанії може бути викорстаний багато раз але забивається додатково память)
        // якщо потрібен додатковий ссилочний тип який буде використано далі
        company company = new company("name", "catch", "ss");
        //
        User user1 = new User(
                1,
                "lenny",
                "user1",
                "gmail.com",
                "3445223r",
                "afda.com",
                 company);
        //2-- відразу (оюєкт компанія належитть суто цьому екземпляру)
        User user2 = new User(
                2,
                "lenny",
                "user1",
                "gmail.com",
                "3445223r",
                "afda.com",
                 new company("name2", "catch2", "bb"));
        //спеціальний конструктор з додатковипи аргументами
        User user3 = new User(
                3,
                "lenny",
                "user1",
                "gmail.com",
                "3445223r",
                "afda.com",
                "name",
                "phraze",
                "sbb"
                );
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        // перші два випадки це агрегація - обєкт приходить вже готовим ззовні
        // останній - композиція - обєкт будується по частинам в середині іншого обєкта


    }

}
