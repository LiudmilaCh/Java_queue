/******************************************************************************

автор Чижикова Людмила Андреевна
Liudmila Chizhikova (c)

*******************************************************************************/
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> wordsQueue = new LinkedList<>();
        Queue<String> wordsSort = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для окончания ввода введите 'стоп'):");

        String word;
        while (true) {
            word = scanner.nextLine();
            if (word.equals("стоп")) {
                break;
            }
            wordsQueue.add(word);
            wordsSort.add(word);
        }
        
        System.out.println("Введите слово для поиска в массиве:");
        String searchWord = scanner.nextLine();

        boolean isFound = false;
        int index = 0;
        for (String queuedWord : wordsQueue) {
            if (queuedWord.equals(searchWord)) {
                isFound = true;
                break;
            }
            index++;
        }

        if (isFound) {
            System.out.println("Слово '" + searchWord + "' найдено в массиве на позиции " + index);
        } else {
            System.out.println("Слово '" + searchWord + "' не массиве в очереди");
        }
 System.out.println("Размер массива: " + wordsQueue.size());
 System.out.println("Отсортированные слова по алфавиту:");
        while (!wordsSort.isEmpty()) {
            System.out.println(wordsSort.poll());
        }    
        
    }
}