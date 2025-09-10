# 📱 FastCalculation

Um aplicativo Android desenvolvido em **Kotlin** com o objetivo de treinar operações matemáticas rápidas, voltado para fins acadêmicos no curso de **Desenvolvimento de Sistemas para Dispositivos Móveis**.

---

## 🚀 Funcionalidades

- Definição do nome do jogador.  
- Configuração do número de rodadas (1, 5 ou 10).  
- Escolha do intervalo entre rodadas (1s, 3s ou 5s).  
- Execução do jogo com cálculos matemáticos.  
- Exibição dos resultados dentro da **GameFragment**.

---

## 🛠 Tecnologias Utilizadas

- [Kotlin](https://kotlinlang.org/)  
- [Android Studio](https://developer.android.com/studio)  
- Arquitetura baseada em **Fragments**  
- **ViewBinding** para gerenciamento de layout  
- **Emulador Android (API 23 - Nexus 4)** para testes

---

## 📂 Estrutura do Projeto

```
FastCalculation/
│
├── app/                  # Código fonte do app
├── build/                # Arquivos de build
├── gradle/               # Configuração do Gradle
├── screenshots/          # Imagens do app (screenshots)
│   ├── xcelular tela 0.png
│   ├── xcelular tela 1-2.png
│   ├── xcelular tela 3-4-5.png
│   ├── xtela 1.png
│   ├── xtela 2.png
│   ├── xtela 3.png
│   ├── xtela 4.png
│   └── xtela 5.png
│   
│
├── .gitignore
├── build.gradle
├── gradle.properties
├── local.properties
├── settings.gradle
└── xFastCalculation.mkv  # Vídeo demonstrativo
```

---

## 📸 Demonstração do App

### Tela Inicial (Emulando via Nexus 4 - api 23)

<img src="file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xtela%201.png" title="" alt="Tela Inicial 1-2" data-align="inline">

### Tela 2 (Welcome)

![Tela 2](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xtela%202.png)

### Tela 3 (Jogando)

![Tela 3 jogando](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xtela%203.png)

### Tela 4 (Resultado)

![Tela 4 (Resultado)](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xtela%204.png)

### Tela 5 (Restart e Exit)

![Tela 5 (Restart e Exit)](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xtela%205.png)



### Projeto emulando via dispositivo móvel

![via celular](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xcelular%20tela%200.png)

### Tela celular 1-2

![Tela celular 1](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xcelular%20tela%201-2.png)

### Tela celular 3-4-5

![Tela celular 3-4-5](file:///C:/Users/deeja/Desktop/FastCalculation/screenshots/xcelular%20tela%203-4-5.png)

---

## 📌 Alterações Solicitadas (Exercício)

Conforme o PDF da disciplina, as seguintes modificações devem ser realizadas:

1. Criar uma nova **tela de resultado** (Fragment ou Activity) para mostrar o resultado do jogo (atualmente exibido em `GameFragment`).  
   
   - O resultado deve ser passado para essa tela via **argumentos (Bundle)** ou **Intent extra**.  

2. A nova tela deve conter um **botão** que:  
   
   - Reinicie o jogo a partir da `GameFragment`;  
   - Utilize as mesmas configurações já definidas pelo usuário.  

---

## ▶️ Como Executar o Projeto

1. Clone este repositório:
   
   ```bash
   git clone https://github.com/seu-usuario/fastcalculation.git
   ```

2. Abra no **Android Studio**.  

3. Execute no emulador ou dispositivo físico.  

---

## 🎥 Vídeo Demonstrativo

Também há um vídeo mostrando o funcionamento do app:  
👉 [xFastCalculation.mkv](./xFastCalculation.mkv)

---

## 📚 Créditos

Projeto acadêmico desenvolvido para a disciplina **Desenvolvimento para Android 1 – D1DA1**, ministrada pelo professor **Pedro Northon Nobile (IFSP)**.  
