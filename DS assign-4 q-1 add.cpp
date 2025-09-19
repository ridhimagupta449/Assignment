#include <iostream>
using namespace std;

void printBinary(int num) {
    int bin[32]; // store binary digits
    int idx = 0;

    while (num > 0) {
        bin[idx++] = num % 2;
        num = num / 2;
    }

    // print in reverse
    for (int i = idx - 1; i >= 0; i--) {
        cout << bin[i];
    }
}

void generateBinary(int n) {
    for (int i = 1; i <= n; i++) {
        printBinary(i);
        if (i != n) cout << ", ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    generateBinary(n);

    return 0;
}

