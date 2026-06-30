public class NajPalindrom3x3 {

    public static void main(String[] args) {
        
        // Zmienna do przechowywania aktualnie znalezionego największego palindromu
        int largestPalindrome = 0;

        // Pierwsza pętla: iterujemy przez pierwszą liczbę 3-cyfrową (od największej: 999 w dół do 100)
        for (int i = 999; i >= 100; i--) {
            
            // Druga pętla: iterujemy przez drugą liczbę 3-cyfrową.
            // Zaczynamy od 'i', aby uniknąć powtórzeń (np. 900*990 to to samo co 990*900)
            for (int j = i; j >= 100; j--) {
                
                // Obliczamy iloczyn dwóch liczb
                int product = i * j;

                // Optymalizacja: Jeśli iloczyn jest mniejszy niż już znaleziony rekord,
                // przerywamy wewnętrzną pętlę, bo kolejne liczby będą tylko mniejsze.
                if (product <= largestPalindrome) {
                    break; 
                }

                // Sprawdzamy, czy obliczony iloczyn jest palindromem, używając naszej metody pomocniczej
                if (isPalindrome(product)) {
                    // Jeśli tak, i jest on większy od dotychczasowego rekordu (co gwarantuje powyższy if),
                    // zapisujemy go jako nowy największy palindrom
                    largestPalindrome = product;
                }
            }
        }

        // Wyświetlamy ostateczny wynik w konsoli
        System.out.println("Największy palindrom iloczynu liczb 3-cyfrowych to: " + largestPalindrome);
    }

    // Metoda pomocnicza sprawdzająca, czy liczba jest palindromem
    public static boolean isPalindrome(int number) {
        // Zapamiętujemy oryginalną liczbę, aby móc ją na końcu porównać
        int originalNumber = number;
        // Zmienna, w której zbudujemy odwróconą wersję liczby
        int reversedNumber = 0;

        // Pętla wykonuje się dopóki mamy cyfry do przetworzenia
        while (number != 0) {
            // Pobieramy ostatnią cyfrę liczby (reszta z dzielenia przez 10)
            int remainder = number % 10;
            
            // Przesuwamy dotychczasowy wynik w lewo (*10) i dodajemy pobraną cyfrę
            reversedNumber = reversedNumber * 10 + remainder;
            
            // Usuwamy ostatnią cyfrę z oryginalnej liczby (dzielenie całkowite przez 10)
            number /= 10;
        }

        // Zwracamy prawdę (true), jeśli liczba oryginalna jest równa odwróconej
        return originalNumber == reversedNumber;
    }
}