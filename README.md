# TDE-Ordenação
# Pontifícia Universidade Católica do Paraná
Aluno: André Vinícius Martins de Souza Acosta de Jesus

# Tabela de resultado por vetor

| Algoritmo      | Vetor 1       | Vetor 2      | Vetor 3        |
| -------------- | ------------- | ------------ | -------------- |
| Bubble Sort    | I: 180, T: 78 | I: 19, T: 0  | I: 190, T: 190 |
| Cocktail Sort  | I: 154, T: 78 | I: 19, T: 0  | I: 190, T: 190 |
| Selection Sort | I: 190, T: 18 | I: 190, T: 0 | I: 190, T: 10  |
| Comb Sort      | I: 129, T: 22 | I: 110, T: 0 | I: 129, T: 18  |
| Bucket Sort    | I: 72, T: 19  | I: 70, T: 0  | I: 102, T: 63  |
| Gnome Sort     | I: 176, T: 78 | I: 20, T: 0  | I: 400, T: 190 |


# Ranking por menos trocas (mais eficiente na manipulação de elementos)

| Vetor | 1º                                              | 2º               | 3º               | 4º                          | 5º |
| ----- | ----------------------------------------------- | ---------------- | ---------------- | --------------------------- | -- |
| 1     | Selection Sort (18)                             | Bucket Sort (19) | Comb Sort (22)   | Bubble/Cocktail/Gnome (78)  | -  |
| 2     | Bubble/Selection/Cocktail/Comb/Bucket/Gnome (0) | -                | -                | -                           | -  |
| 3     | Selection Sort (10)                             | Comb Sort (18)   | Bucket Sort (63) | Bubble/Cocktail/Gnome (190) | -  |

Vetor 1: Selection Sort foi o mais eficiente, seguido de Bucket Sort e Comb Sort. Bubble e Cocktail Sort trocaram muitos elementos.

Vetor 2: Todos os algoritmos que não precisaram trocar elementos empataram (0 trocas).

Vetor 3: Selection Sort e Comb Sort se saíram melhor, Bucket e Bubble/Cocktail Sort foram menos eficientes.


# Ranking por menos iterações (mais eficiente nos laços)

| Vetor | 1º                | 2º                                                                      | 3º                    | 4º                   | 5º                   |
| ----- | ----------------- | ----------------------------------------------------------------------- | --------------------- | -------------------- | -------------------- |
| 1     | Bucket Sort (72)  | Comb Sort (129)                                                         | Cocktail Sort (154)   | Bubble Sort (180)    | Selection Sort (190) |
| 2     | Bucket Sort (70)  | Bubble/Cocktail/Gnome/Comb/Selection (19-20-70-110-190) → melhor Bucket | -                     | -                    | -                    |
| 3     | Bucket Sort (102) | Comb Sort (129)                                                         | Bubble/Cocktail (190) | Selection Sort (190) | Gnome Sort (400)     |

Vetor 1: Bucket Sort percorreu menos vezes os laços, seguido de Comb Sort e Cocktail/Bubble Sort. Selection Sort teve mais iterações.

Vetor 2: Bucket, Cocktail e Bubble Sort precisaram de muito poucas iterações, sendo o Bucket Sort ligeiramente melhor.

Vetor 3: Bucket Sort novamente foi o mais rápido em iterações, seguido de Comb Sort; Bubble, Cocktail e Selection Sort percorreram mais laços.



