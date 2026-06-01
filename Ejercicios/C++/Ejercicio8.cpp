#include <iostream>
#include <vector>
#include <stdexcept> // Librería necesaria para atrapar excepciones

using namespace std;

int main() {
    int arr[2]; // Límite estricto de 2 espacios (índices 0 y 1)
    vector<int> lista;
    
    // El vector soporta múltiples inserciones dinámicas sin importar el límite inicial
    lista.push_back(10); 
    lista.push_back(20); 
    lista.push_back(30); // Funciona perfecto
    cout << "Vector crece, size: " << lista.size() << "\n";
    
    // Control de errores para el arreglo
    try {
        int indiceAIngresar = 2;
        
        // Simulamos la validación estricta de límites que hace Java
        if(indiceAIngresar >= 2) {
            throw out_of_range("Limite superado");
        }
        arr[indiceAIngresar] = 30; // Intento de escritura
        
    } catch(const out_of_range& e) {
        cout << "Error en arreglo: " << e.what() << "\n";
    }
    
    return 0;
}
