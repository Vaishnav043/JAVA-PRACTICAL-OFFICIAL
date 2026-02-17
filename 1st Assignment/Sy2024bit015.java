import java.util.*;
public class Sy2024bit015 {

// logic 1
static void logic1(int n) {
if (n % 2 == 0) {
System.out.println("Only odd size allowed\n");
return;
}
int mid = (n + 1) / 2;
int gap = -1;

// Upper half
for (int i = 1; i <= mid; i++) {
for (int s = 1; s <= mid - i; s++)
System.out.print(" ");
System.out.print("*");
if (gap >= 0) {
for (int g = 1; g <= gap; g++)
System.out.print(" ");
System.out.print("*");
}
gap += 2;
System.out.println();
}
gap -= 4;

// Lower half
for (int i = mid - 1; i >= 1; i--) {
for (int s = 1; s <= mid - i; s++)
System.out.print(" ");
System.out.print("*");
if (gap >= 0) {
for (int g = 1; g <= gap; g++)
System.out.print(" ");
System.out.print("*");
}
gap -= 2;
System.out.println();
}
System.out.println();
}

// logic 2
static void logic2(int n) {
if (n % 2 == 0) {
System.out.println("Only odd size allowed\n");
return;
}
int center = n / 2;
for (int r = 0; r < n; r++) {
int dist;
if (r <= center)
dist = center - r;
else
dist = r - center;

for (int c = 0; c < n; c++) {
if (c == dist || c == n - dist - 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
System.out.println();
}

// logic 3
static void logic3(int n) {
if (n % 2 == 0) {
System.out.println("Only odd size allowed\n");
return;
}
int mid = n / 2;

for (int r = 0; r < n; r++) {
for (int c = 0; c < n; c++) {
int rowDist, colDist;

if (r >= mid) rowDist = r - mid;
else rowDist = mid - r;

if (c >= mid) colDist = c - mid;
else colDist = mid - c;

int distance = rowDist + colDist;
if (distance == mid)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
System.out.println();
}

public static void main(String[] args) {
logic1(8);
logic1(9);
logic2(9);
logic3(9);
}
}