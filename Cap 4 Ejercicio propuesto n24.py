# Ingresar los pesos de las esferas
peso_A = float(input("Ingrese el peso de la esfera A: "))
peso_B = float(input("Ingrese el peso de la esfera B: "))
peso_C = float(input("Ingrese el peso de la esfera C: "))
# Determinar cuál es la esfera de mayor peso
if peso_A > peso_B and peso_A > peso_C:
    mayor = 'A'
    peso_mayor = peso_A
elif peso_B > peso_A and peso_B > peso_C:
    mayor = 'B'
    peso_mayor = peso_B
else:
    mayor = 'C'
    peso_mayor = peso_C
# Imprimir el resultado
print(f"La esfera de mayor peso es la {mayor} con un peso de {peso_mayor} unidades.")