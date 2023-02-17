# TaxPayer

Desafio realizado através da análise de um problema, no qual solicita que seja informado a quantidade de pagadores o programa vai ler, em seguida, através de um loop, irá questionar se é uma pessoa física ou jurídica, caso seja física, será questionado o valor gasto com saúde, caso seja jurídica, será questionado a quantidade de funcionários da empresa. Essas informações são importantes pois cada cálculo de imposto difere entre esses dois tipos diferentes.

Foi criada uma classe abstrata TaxPayer, cujos atributos são: nome e renda anual, através dessa classe genérica, foram criadas duas subclasses, uma que referencia as pessoas físicas, contendo como atributo o gasto com saúde, fazendo com que o método abata o pagamento de impostos nesse gasto em 50%. A outra subclasse referencia as pessoas jurídicas, com o atributo "numberOfEmloyees". Lembrando que o método de cálculo da taxa de imposto possui condicionais em cada caso, e em ambos os casos há diferenciação na taxa cobrada conforme o valor bruto anual.

O intuito deste desafio foi aplicar a teoria aprendida em orientação a objetos com Java, sobretudo, sobre classes, herança, polimorfismo e classes/métodos abstratos, portanto só é funcional através do terminal.
