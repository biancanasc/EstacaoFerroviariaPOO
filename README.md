# Estação Ferroviária

Este é um sistema de exemplo que modela uma estrutura ferroviária, incluindo estações, linhas, trens, locomotivas, vagões e recursos ferroviários. O sistema é representado por classes em Java e demonstra a relação entre essas entidades.

## Funcionalidades

O sistema ferroviário tem as seguintes funcionalidades:

1. Criação de **Estação Ferroviária**:
   - As estações possuem uma sigla e uma descrição.
   - Cada estação pode conter uma ou mais linhas ferroviárias.

2. Criação de **Linha Ferroviária**:
   - Cada linha ferroviária tem um número, uma extensão em metros e uma descrição.
   - Uma linha ferroviária pertence a uma estação ferroviária.
   - Cada linha pode conter recursos ferroviários, como trens, locomotivas e vagões.

3. Criação de **Trem**:
   - Os trens são compostos por recursos ferroviários, como locomotivas e vagões.
   - Cada trem tem um prefixo, uma estação de origem e uma estação de destino.
   - O sistema verifica o limite de 150 recursos por trem.

4. Criação de **Locomotiva**:
   - As locomotivas têm um número de série, uma capacidade de tração e um comprimento.

5. Criação de **Vagão**:
   - Os vagões têm um número de série, um tipo, uma capacidade de carga, um comprimento entre testeiras e um comprimento dos engates.

## Uso

Você pode usar esse sistema de exemplo para entender como as entidades ferroviárias interagem entre si. A classe `Main` contém um exemplo de uso, onde são criadas estações, linhas, trens, locomotivas e vagões, e suas relações são demonstradas.

## Execução

Para executar o código de exemplo, siga estas etapas:

1. Clone este repositório para o seu ambiente local.
2. Abra o projeto em sua IDE Java preferida.
3. Execute a classe `Main` para visualizar a saída no console.

## Contribuição

Agradecemos o seu interesse em contribuir! No entanto, este projeto é atualmente mantido como um exemplo e não está aberto para contribuições externas. Sinta-se à vontade para usá-lo como referência para seus próprios projetos.

## Questões

Se você tiver alguma dúvida sobre o funcionamento deste sistema ou encontrar algum problema, por favor, abra uma "issue" neste repositório. Estamos aqui para ajudar e aprimorar o projeto com sua colaboração.

Desenvolvido por **Bianca Oliveira** e **Melissa Guedes**.
