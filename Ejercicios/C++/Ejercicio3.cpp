#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<string> prods; 
    prods.push_back("Teclado"); prods.push_back("Mouse"); prods.push_back("Monitor");
    string buscar; cout << "Buscar producto: "; cin >> buscar;
    bool enc = false;
    for(string p : prods) if(p == buscar) enc = true;
    cout << (enc ? "Producto encontrado\n" : "No existe\n");
    return 0;
}
