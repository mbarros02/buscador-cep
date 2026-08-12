# 📍 Buscador de CEP

Aplicação em Java para consulta de endereços a partir do CEP, utilizando a [API ViaCEP](https://viacep.com.br/).

Este projeto é uma jornada de evolução em etapas públicas:

- [x] **Fase 1** — Java puro, sem frameworks, via linha de comando
- [ ] **Fase 2** — Migração para um framework (Spring)
- [ ] **Fase 3** — Saindo da linha de comando (API REST)
- [ ] **Fase 4** — Interface web

> Acompanhe a evolução pelas [releases](../../releases) do repositório.

## 🧠 Motivação

Projeto de estudo criado para praticar Java "na unha" antes de partir para
frameworks, entendendo o que eles resolvem por baixo dos panos (injeção de
dependência, roteamento HTTP, serialização, etc).

## 🚀 Como executar (Fase 1)

Pré-requisitos: JDK 17+ e Maven

\`\`\`bash
git clone https://github.com/seu-usuario/buscador-cep.git
cd buscador-cep
mvn compile exec:java -Dexec.mainClass="com.seunome.buscadorcep.Main"
\`\`\`

Digite um CEP quando solicitado e veja o endereço retornado.

## 🛠️ Tecnologias

- Java 17
- HttpClient (java.net.http) — requisições HTTP nativas
- Jackson/Gson — parsing de JSON *(ajuste conforme o que você usar)*
- API [ViaCEP](https://viacep.com.br/)

## 📌 Roadmap

Veja o roadmap detalhado em [issues](../../issues) ou no board do projeto.

## 📄 Licença

Este projeto está sob a licença MIT.
