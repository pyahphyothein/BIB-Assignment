public class Assignment2 {
    public static void main(String[] args) {
        int n = 7;


        for (int i = 1; i <= n; i++) {

            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
Upper part (i = 1 → 7)
i တန်ဖိုးတိုးချင်းနဲ့ leading-space = i-1 ဖြစ်တယ်၊ j က i → n အထိ

i = 1

s loop: for (s = 1; s < 1; s++) → no iteration (leading spaces = 0)

j loop: j = 1,2,3,4,5,6,7

printed line: 1 2 3 4 5 6 7


i = 2

s loop: s = 1 → prints 1 space

j loop: j = 2,3,4,5,6,7

printed line: [space]2 3 4 5 6 7


i = 3

s loop: s = 1, 2 → prints 2 spaces

j loop: j = 3,4,5,6,7

printed line: [2 spaces]3 4 5 6 7


i = 4

s: 1,2,3 → 3 spaces

j: 4,5,6,7

printed: [3 spaces]4 5 6 7


i = 5

s: 1,2,3,4 → 4 spaces

j: 5,6,7

printed: [4 spaces]5 6 7


i = 6

s: 1,2,3,4,5 → 5 spaces

j: 6,7

printed: [5 spaces]6 7


i = 7

s: 1,2,3,4,5,6 → 6 spaces

j: 7

printed: [6 spaces]7


Lower part (i = 6 → 1)

Lower part မှာ outer loop က i = n-1 (6) ကနေ 1 ထိ ကျဆင်းတယ် — အလုပ်လုပ်ပုံက အပေါ်ပိုင်းနဲ့ တူတူပဲ။

i = 6

s: 1..5 → 5 spaces

j: 6,7

printed: [5 spaces]6 7


i = 5

s: 1..4 → 4 spaces

j: 5,6,7

printed: [4 spaces]5 6 7


i = 4

s: 1..3 → 3 spaces

j: 4,5,6,7

printed: [3 spaces]4 5 6 7


i = 3

s: 1..2 → 2 spaces

j: 3,4,5,6,7

printed: [2 spaces]3 4 5 6 7


i = 2

s: 1 → 1 space

j: 2,3,4,5,6,7

printed: [1 space]2 3 4 5 6 7


i = 1

s: none → 0 spaces

j: 1..7

printed: 1 2 3 4 5 6 7
 */

 