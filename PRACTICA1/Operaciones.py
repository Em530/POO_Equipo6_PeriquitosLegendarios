def operaciones_basicas():
    try:
        # Pedimos al usuario que ingrese los valores
        num1 = float(input("Ingresa el primer número: "))
        num2 = float(input("Ingresa el segundo número: "))
        
        print("\n--- Resultados ---")
        print(f"Suma: {num1 + num2}")
        print(f"Resta: {num1 - num2}")
        print(f"Multiplicación: {num1 * num2}")
        
        # Validamos la división entre cero
        if num2 != 0:
            print(f"División: {num1 / num2}")
        else:
            print("División: Error (no se puede dividir entre cero)")
            
    except ValueError:
        print("\nError: Por favor, ingresa solo valores numéricos válidos.")

# Ejecución del programa
operaciones_basicas()

