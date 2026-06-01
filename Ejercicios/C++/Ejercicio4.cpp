#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<string> lista; int op, idx; string item;
    do {
        cout << "1.Crear 2.Leer 3.Editar 4.Borrar 5.Salir: "; cin >> op;
        if(op == 1) { cin >> item; lista.push_back(item); }
        else if(op == 2) { for(int i=0; i<lista.size(); i++) cout<<i<<": "<<lista[i]<<"\n"; }
        else if(op == 3) { cin>>idx>>item; if(idx<lista.size()) lista[idx] = item; }
        else if(op == 4) { cin>>idx; if(idx<lista.size()) lista.erase(lista.begin()+idx); }
    } while(op != 5);
    return 0;
}
