public class ManagerTST {
    public static void main (String[] args) {


        String[] films = new String[2];
        String newFilm = "Метод";
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i <= films.length; i++)
        {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

}
