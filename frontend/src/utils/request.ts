//vai verificar se existe a variável de ambiente caso n tiver ?? roda no local. No provedor ele roda com variavel definida com endereço do heroku.
export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? 'http://localhost:8080';


