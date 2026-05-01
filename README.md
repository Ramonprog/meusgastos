# API de Gastos Pessoais

## Objetivo

Criar uma API para gastos pessoais.

---

## Planejamento do Sistema

### 1. Controle de usuários (CRUD)

- [ ] Criar CRUD de usuários
- [ ] Criar autenticação com JWT

---

### 2. Centros de custo (CRUD)

- [ ] Criar CRUD de centros de custo
- [ ] Todo centro de custo deve estar vinculado a um usuário

---

### 3. Títulos (CRUD)

Tipos:
- APAGAR
- ARECEBER

- [ ] Criar CRUD de títulos
- [ ] Todo título deve estar vinculado a um usuário
- [ ] Todo título deve estar vinculado a 1 ou N centros de custo

---

### 4. Fluxo de caixa

- [ ] Criar endpoint de fluxo de caixa

O endpoint deve retornar:

- Total a pagar
- Total a receber
- Saldo
- Lista de títulos a pagar
- Lista de títulos a receber

Também deve permitir filtro por período de vencimento.