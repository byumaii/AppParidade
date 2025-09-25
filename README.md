# Projeto: App Paridade (.NET MAUI vs. Android Nativo)

Este repositório contém o código-fonte para a atividade de avaliação de plataformas de desenvolvimento mobile, comparando o desempenho, a produtividade e a experiência de desenvolvimento entre .NET MAUI e Android Nativo.

O projeto consiste em um aplicativo de consulta de capitais brasileiras, que exibe detalhes de seus respectivos estados consumindo uma API pública do IBGE e utiliza recursos nativos do dispositivo, como geolocalização.

## Estrutura do Repositório

-   `/maui`: Contém o projeto completo desenvolvido com .NET MAUI e Visual Studio 2022.
-   `/android-nativo`: Contém o projeto equivalente desenvolvido com Android Nativo (Kotlin/Java) e Android Studio.

---

## Funcionalidades Implementadas

Ambos os aplicativos implementam o seguinte conjunto de funcionalidades para garantir a paridade na comparação:

-   ✅ **Navegação Básica:** Fluxo da tela de lista para a tela de detalhes com botão de retorno.
-   ✅ **Lista Filtrável:** Lista com 27 capitais carregadas de um JSON local, com busca em tempo real.
-   ✅ **Requisição HTTP:** Chamada `GET` à API do IBGE para buscar detalhes do estado.
-   ✅ **Recurso Nativo:** Leitura da geolocalização (GPS) para calcular a distância até a capital selecionada.
-   ✅ **Suporte a Tema:** A interface se adapta aos modos Claro (Light) e Escuro (Dark).
-   ✅ **Teste Unitário:** Um teste simples para validar a lógica de filtro da lista.

---

## 🚀 App .NET MAUI

Esta seção descreve como compilar e executar o aplicativo desenvolvido em .NET MAUI.

### Requisitos

-   Visual Studio 2022 Community (v17.9 ou superior).
-   Carga de Trabalho (Workload) ".NET Multi-platform App UI development" instalada.
-   .NET 9 SDK.
-   Um Emulador Android configurado (ex: via Android Device Manager).

### Como Compilar e Rodar

1.  Clone este repositório para a sua máquina local.
2.  Abra o arquivo de solução localizado na pasta `/maui` com o Visual Studio 2022.
3.  Aguarde o Visual Studio restaurar os pacotes NuGet necessários.
4.  Na barra de ferramentas do topo, selecione o alvo da compilação:
    -   Para rodar no Windows, escolha **"Máquina Windows" (Windows Machine)**.
    -   Para rodar no Android, escolha um **Emulador Android** da lista.
5.  Pressione **F5** ou clique no botão de Play verde para compilar e executar o aplicativo.

---

## 🤖 App Android Nativo

Esta seção descreve como compilar e executar o aplicativo desenvolvido com Android Nativo.

### Requisitos

-   Android Studio Narwhal (ou superior).
-   Android SDK (API 34 ou superior).
-   Um Emulador Android configurado (ex: via Android Virtual Device Manager).

### Como Compilar e Rodar

1.  Clone este repositório para a sua máquina local.
2.  Abra o **Android Studio**.
3.  Selecione **"Open an existing project"** e navegue até a pasta `/android-nativo` deste repositório.
4.  Aguarde o Android Studio sincronizar o projeto com o Gradle (pode levar alguns minutos).
5.  Na barra de ferramentas do topo, selecione um **Emulador Android** da lista de dispositivos disponíveis.
6.  Pressione o botão de Play verde (▶️) ou use o atalho `Shift + F10` para compilar e executar o aplicativo.
