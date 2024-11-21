# Bar_OO

## Descrição
Este programa simula o cálculo da conta de um cliente em um bar. Ele considera o consumo de bebidas, espetinhos e a taxa de couvert artístico, levando em conta uma política de isenção de couvert dependendo do valor consumido. O programa também diferencia o preço do ingresso entre homens e mulheres.

## Funcionalidades
- Calcular o custo do ingresso com base no sexo do cliente.
- Calcular o total gasto com cervejas, refrigerantes e espetinhos.
- Aplicar a taxa de couvert artístico (isenta para consumo acima de R$ 30,00).
- Exibir um relatório detalhado com o total a ser pago.

## Requisitos
- Linguagem: **Java** (ou qualquer outra linguagem usada para implementar a classe `Bill`).
- Estrutura do programa segue a classe `Bill`, conforme o diagrama UML fornecido.

## Exemplo de Uso

### Entrada:
- **Sexo**: `M` (Masculino)  
- **Cervejas consumidas**: `4`  
- **Refrigerantes consumidos**: `2`  
- **Espetinhos consumidos**: `3`  

### Saída:
```text
RELATÓRIO:

Consumo = R$ 43.00
Isento de Couvert
Ingresso = R$ 10.00
Valor a pagar = R$ 53.00
```

## Estrutura do Projeto

### Bill
Classe responsável pelos cálculos e regras de negócio.

#### Atributos:
- `gender`: sexo do cliente (F ou M).
- `beer`, `barbecue`, `softDrink`: quantidades consumidas de cada item.

#### Métodos:
- `cover()`: Calcula a taxa de couvert artístico.
- `feeding()`: Calcula o total do consumo de comidas e bebidas.
- `ticket()`: Retorna o valor do ingresso com base no sexo.
- `total()`: Calcula o valor total da conta.

## Tecnologias Utilizadas
![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
