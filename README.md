# CVDS-LAB04

## Clases de Equivalencia OriginalScore 

| Numero | Especificación                          | Valido/no Valido |
|--------|-----------------------------------------|------------------|
| 1      | 0>=incorrectCount<=10 & CorrectCount>=0 | valido           |
| 2      | CorrectCount<0                          | invalid          |
| 3      | incorrectCount<0                        | invalid          |
| 4      | incorrectCount>10                       | invalid          |

## Clases de Equivalencia BonusScore

| Numero | Especificación                                                          | Valido/no Valido |
|--------|-------------------------------------------------------------------------|------------------|
| 1      | CorrectCount/2 < IncorrectCount                                         | Invalid          |
| 2      | CorrectCount<0 || IncorrectCount<0                                      | invalid          |
| 3      | CorrectCount/2 >= IncorrectCount & CorrectCount>=0 & IncorrectCount >=0 | Valid            |

## Clases de Equivalencia PowerBonusScore

| Numero | Especificación                                                                       | Valido/no Valido |
|--------|--------------------------------------------------------------------------------------|------------------|
| 1      | 5^CorrectCount < 8*IncorrectCount                                                    | invalid          |
| 2      | 5^CorrectCount -8*IncorrectCount > 500                                               | Invalid          |
| 3      | IncorrectCount <0|| CorrectCount<0                                                   | Invalid          |
| 4      | (5^CorrectCount >= 8*IncorrectCount) &                                               | Valid            |
|        | (5^CorrectCount -8*IncorrectCount <= 500) & (IncorrectCount >=0 & CorrectCount >= 0) |                  |

