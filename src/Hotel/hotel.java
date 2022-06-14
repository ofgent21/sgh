package Hotel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

import Dominio.clientes;
import Dominio.quartos;
import Dominio.telas;

public class hotel {

	public static void main(String[] args) throws ParseException{

		Scanner in = new Scanner(System.in);

		ArrayList<clientes> clientes = new ArrayList<clientes>();
		ArrayList<quartos> quartos = new ArrayList<quartos>();

		int inicio = 0;

		while (inicio != 1) {
			try {
				telas.telaInicial();
				if (quartos.size() > 1) {
					System.out.println(quartos.size() + " Quartos Cadastrados.");
				} else if (quartos.size() == 0) {
					System.out.println("NÃO HÁ QUARTOS REGISTRADOS");
				} else {
					System.out.println(quartos.size() + " Quarto Cadastrado.");
				}

				if (clientes.size() > 1) {
					System.out.println(clientes.size() + " Clientes Cadastrados.");
				} else if (clientes.size() == 0) {
					System.out.println("NÃO HÁ CLIENTES REGISTRADOS");
				} else {
					System.out.println(clientes.size() + " Cliente Cadastrado.");
				}

				int op = in.nextInt();
				in.nextLine();

				switch (op) {
				case 0: {
					inicio = 1;
					telas.linhaDois();
					System.out.println(" OBRIGADO POR UTILIZAR OS SERVIÇOS DO GERENCIAMENTO DE HOTEL ");
					telas.linhaDois();
					break;
				}

				case 1: {
					int opWhileMenuCliente = 0;
					while (opWhileMenuCliente != 1) {
						telas.linhaDois();
						System.out.println(" SGH - MENU CLIENTES ");
						telas.linhaDois();
						telas.espaco();
						System.out.println("  1 - Cadastro ");
						System.out.println("  2 - Alteração ");
						System.out.println("  3 - Lista de Clientes");
						System.out.println(" 99 - EXCLUSÃO DE CLIENTES");
						System.out.println("  0 - MENU PRINCIPAL ");
						int opMenuCliente = in.nextInt();
						in.nextLine();

						switch (opMenuCliente) {

						case 1: {
							telas.linhaDois();
							System.out.println(" SGH - Clientes -> CADASTRO");
							telas.linhaDois();
							String regCodigoCliente = "";
							if (clientes.size() == 0) {
								regCodigoCliente = "1";
							} else {
								for (int novoI = 0; novoI < clientes.size(); novoI++) {
									clientes regCodigoClienteZ = clientes.get(novoI);
									int regCodigoZZ = 1 + Integer.parseInt(regCodigoClienteZ.getCodigoCliente());
									regCodigoCliente = Integer.toString(regCodigoZZ);
								}
							}
							System.out.println("Codigo do Cliente: " + regCodigoCliente);

							System.out.println("Nome: ");
							String regNomeCliente = in.nextLine();
							

							System.out.println("Data de Nascimento: ");
							String regDataNascimentoCliente = in.next();
							in.nextLine();

							System.out.println("Telefone: ");
							String regTelefoneCliente = in.next();
							in.nextLine();

							System.out.println("Endereço:");
							String regEnderecoCliente = in.next();
							in.nextLine();

							System.out.print(" NR ");
							String regNumeroLogradouroCliente = in.next();
							in.nextLine();

							System.out.println("Bairro: ");
							String regBairroCliente = in.next();
							in.nextLine();

							System.out.println("CEP: ");
							String regCepCliente = in.next();
							in.nextLine();

							System.out.print(" Cidade: ");
							String regCidadeCliente = in.next();
							in.nextLine();

							System.out.print(" UF: ");
							String regUFCliente = in.next();
							in.nextLine();

							System.out.println("CPF: ");
							String regCPFCliente = in.next();
							in.nextLine();

							System.out.print(" RG: ");
							String regRGCliente = in.next();
							in.nextLine();
							String regFumanteCliente = "O";
							int temp = 0;
							// REGISTRO DE FUMANTE S OU N
							while (temp != 1) {
								System.out.println("Fumante? S ou N ");
								regFumanteCliente = in.next();
								in.nextLine();
								if (regFumanteCliente.equals("S") || regFumanteCliente.equals("N")) {
									temp = 1;
								} else {
									System.out.println(" Digite S ou N ");

								}

							}
							// FIM REGISTRO DE FUMANTE S OU N
							System.out.println("Quantidade de pessoas a serem hospedadas (conta o cliente):   ");
							String regQuantasPessoasCliente = in.next();
							in.nextLine();

							String regQuartoCliente = "";
							String regCheckInCliente = "";
							String regCheckOutCliente = "";
							String regValorPeriodoCliente = "";

							// INICIO CONFIRMA
							telas.linhaDois();
							System.out.println("      Confirma o registro?   1-> SIM    2->Não");
							int opOKMenuCadastroCliente = in.nextInt();
							in.nextLine();

							if (opOKMenuCadastroCliente == 1) {
								clientes registroCliente = new clientes(regCodigoCliente, regNomeCliente,
										regDataNascimentoCliente, regTelefoneCliente, regEnderecoCliente,
										regNumeroLogradouroCliente, regBairroCliente, regCepCliente, regCidadeCliente,
										regUFCliente, regCPFCliente, regRGCliente, regFumanteCliente,
										regQuantasPessoasCliente, regQuartoCliente, regCheckInCliente,
										regCheckOutCliente, regValorPeriodoCliente);

								clientes.add(registroCliente);

								telas.linhaDois();
								System.out.println("REGISTRO CONCLUÍDO COM SUCESSO DO CLIENTE \n " + clientes);
								telas.linhaUm();
								telas.espaco();
								telas.espaco();

							}

							// FIM CONFIRMA

							break;
						}
						case 2: {
							telas.linhaDois();
							System.out.println("SGH - ALTERAÇÃO DE CLIENTES");
							telas.linhaDois();
							System.out.println("Código do Cliente para Edição: ");
							String codAlteraCliente = in.next();
							in.nextLine();
							if (codAlteraCliente.equals("0")) {
								break;
							}

							for (int alteraCliente = 0; alteraCliente < clientes.size(); alteraCliente++) {
								clientes tempCodClientes = clientes.get(alteraCliente);

								if (codAlteraCliente.equals(tempCodClientes.getCodigoCliente())) {

									telas.linhaDois();
									System.out.println("CLIENTE LOCALIZADO");
									telas.linhaDois();
									System.out.println("DIGITE O ITEM A ALTERAR ");
									System.out.println("  1 - Nome ");
									System.out.println("  2 - Data de Nascimento");
									System.out.println("  3 - Telefone");
									System.out.println("  4 - Rua ");
									System.out.println("  5 - Número(endereço) ");
									System.out.println("  6 - Bairro");
									System.out.println("  7 - CEP");
									System.out.println("  8 - Cidade");
									System.out.println("  9 - Estado");
									System.out.println(" 10 - CPF");
									System.out.println(" 11 - RG");
									System.out.println(" 12 - Status Fumante S/N");
									System.out.println(" 13 - QTDE de acompanhantes");
									System.out.println(" 99 - Exclui");
									int opItemAlteraCliente = in.nextInt();
									in.nextLine();

									switch (opItemAlteraCliente) {

									case 1: {
										// Nome
										System.out.println("O nome registrado é " + tempCodClientes.getNomeCliente());
										System.out.println("Digite o novo nome: ");
										String alteraNome = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraNome = in.nextInt();
										in.nextLine();
										if (okAlteraNome == 1) {
											tempCodClientes.setNomeCliente(alteraNome);
										}
										break;
									}
									case 2: {
										// - Data de Nascimento");
										System.out.println("Data de Nascimento registrada é "
												+ tempCodClientes.getDataNascimentoCliente());
										System.out.println("Digite a nova data de nascimento: ");
										String alteraDataNascimento = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraDataNascimento = in.nextInt();
										in.nextLine();

										if (okAlteraDataNascimento == 1) {
											tempCodClientes.setDataNascimentoCliente(alteraDataNascimento);
										}
										break;
									}
									case 3: {
										// - Telefone");
										System.out.println(
												"O telefone registrado é " + tempCodClientes.getTelefoneCliente());
										System.out.println("Digite o novo telefone: ");
										String alteraTelefone = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraTelefone = in.nextInt();
										in.nextLine();
										if (okAlteraTelefone == 1) {
											tempCodClientes.setTelefoneCliente(alteraTelefone);
										}
										break;
									}
									case 4: {
										// - Rua ");
										System.out.println(
												"O endereço registrado é " + tempCodClientes.getEnderecoCliente());
										System.out.println("Digite a nova rua: ");
										String alteraRua = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraRua = in.nextInt();
										in.nextLine();
										if (okAlteraRua == 1) {
											tempCodClientes.setEnderecoCliente(alteraRua);
										}
										break;
									}
									case 5: {
										// - Número(endereço) ");
										System.out.println("O número (endereço) registrado é "
												+ tempCodClientes.getNumeroLogradouroCliente());
										System.out.println("Digite o novo número (endereço):");
										String alteraNumeroEndereco = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraNumeroEndereco = in.nextInt();
										in.nextLine();
										if (okAlteraNumeroEndereco == 1) {
											tempCodClientes.setNumeroLogradouroCliente(alteraNumeroEndereco);
										}
										break;
									}
									case 6: {
										// - Bairro");
										System.out
												.println("O bairro registrado é " + tempCodClientes.getBairroCliente());
										System.out.println("Digite o novo bairro: ");
										String alteraBairro = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraBairro = in.nextInt();
										in.nextLine();
										if (okAlteraBairro == 1) {
											tempCodClientes.setBairroCliente(alteraBairro);
										}
										break;
									}
									case 7: {
										// - CEP");
										System.out.println("O CEP registrado é " + tempCodClientes.getCepCliente());
										System.out.println("Digite o novo CEP: ");
										String alteraCEP = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraCEP = in.nextInt();
										in.nextLine();
										if (okAlteraCEP == 1) {
											tempCodClientes.setCepCliente(alteraCEP);
										}
										break;
									}
									case 8: {
										// - Cidade");
										System.out
												.println("A cidade registrado é " + tempCodClientes.getCidadeCliente());
										System.out.println("Digite a nova cidade: ");
										String alteraCidade = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraCidade = in.nextInt();
										in.nextLine();
										if (okAlteraCidade == 1) {
											tempCodClientes.setCidadeCliente(alteraCidade);
										}
										break;
									}
									case 9: {
										// - Estado");
										System.out.println("O estado registrado é " + tempCodClientes.getuFCliente());
										System.out.println("Digite o novo Estado: ");
										String alteraUF = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraUF = in.nextInt();
										in.nextLine();
										if (okAlteraUF == 1) {
											tempCodClientes.setuFCliente(alteraUF);
										}
										break;
									}
									case 10: {
										// - CPF");
										System.out.println("O CPF registrado é " + tempCodClientes.getcPFCliente());
										System.out.println("Digite o novo CPF: ");
										String alteraCPF = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraCPF = in.nextInt();
										in.nextLine();
										if (okAlteraCPF == 1) {
											tempCodClientes.setcPFCliente(alteraCPF);
										}
										break;
									}
									case 11: {
										// - RG");
										System.out.println("O RG registrado é " + tempCodClientes.getrGCliente());
										System.out.println("Digite o novo RG: ");
										String alteraRG = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraRG = in.nextInt();
										in.nextLine();
										if (okAlteraRG == 1) {
											tempCodClientes.setrGCliente(alteraRG);
										}
										break;
									}
									case 12: {
										// - Status Fumante S/N");
										System.out.println("O estado Fumante S/N registrado é "
												+ tempCodClientes.getFumanteCliente());
										System.out.println("Digite a nova condição, S ou N : ");
										String alteraFumante = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraFumante = in.nextInt();
										in.nextLine();
										if (okAlteraFumante == 1) {
											tempCodClientes.setFumanteCliente(alteraFumante);
										}
										break;
									}
									case 13: {
										// - QTDE de acompanhantes");
										System.out.println("A quantidade de pessoas registradas é "
												+ tempCodClientes.getQuantasPessoasCliente());
										System.out.println("Digite a nova quantidade de acompanhantes: ");
										String alteraAcompanhantes = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim    2-> Não");
										int okAlteraAcompanhantes = in.nextInt();
										in.nextLine();
										if (okAlteraAcompanhantes == 1)
											tempCodClientes.setQuantasPessoasCliente(alteraAcompanhantes);
										break;

									}
									case 99: {
										telas.linhaDois();
										System.out.println("SGH - MODO EXCLUSÃO DE CLIENTES");
										telas.linhaDois();
										System.out.println(clientes.get(alteraCliente));
										telas.linhaUm();
										System.out.println("CONFIRMA A EXCLUSÃO? 1-> Sim    2-> Não");
										int okExcluiCliente = in.nextInt();
										in.nextLine();
										if (okExcluiCliente == 1) {
											clientes.remove(alteraCliente);
											telas.linhaDois();
											System.out.println("REGISTRO EXCLUÍDO COM SUCESSO!!!!");
											telas.linhaUm();
										}
										break;
									}

									}

								}

							}

							break;
						}
						case 3: {
							telas.linhaDois();
							System.out.println("SGH - RELATÓRIO DE CLIENTES");
							telas.linhaDois();

							for (int i = 0; i < clientes.size(); i++) {
								System.out.println(clientes.get(i));
								telas.linhaDois();
								telas.espaco();
							}
							break;
						}

						case 99: {
							telas.linhaDois();
							System.out.println("SGH - MODO EXCLUSÃO DE CLIENTES");
							telas.linhaDois();
							if (clientes.size() == 0) {
								System.out.println("Não há registros para excluir");
								break;
							}
							System.out.println("Digite o código do cliente: ");
							String excluiCliente = in.next();
							in.nextLine();
							if (excluiCliente.equals("0")) {
								break;
							}
							for (int excluiClienteZ = 0; excluiClienteZ < clientes.size(); excluiClienteZ++) {
								clientes excluiTemporario = clientes.get(excluiClienteZ);
								if (excluiCliente.equals(excluiTemporario.getCodigoCliente())) {
									telas.linhaDois();
									System.out.println("CLIENTE LOCALIZADO");
									telas.linhaUm();
									System.out.println(clientes.get(excluiClienteZ));
									telas.linhaUm();
									System.out.println("CONFIRMA A EXCLUSÃO? 1-> Sim    2-> Não");
									int okExcluiCliente = in.nextInt();
									in.nextLine();
									if (okExcluiCliente == 1) {
										clientes.remove(excluiClienteZ);
										telas.linhaDois();
										System.out.println("REGISTRO EXCLUÍDO COM SUCESSO!!!!");
										telas.linhaUm();
									}
								} else {
									telas.linhaDois();
									System.out.println("CLIENTE NÃO LOCALIZADO");
									telas.linhaUm();

								}
							}
							break;
						}

						case 0: {
							opWhileMenuCliente = 1;
							break;
						}

						} // SWITCH OPÇÃO CLIENTE

					} // WHILE OPÇÃO MENU CLIENTE
					break;
				}
				case 2: {

					int opWhileMenuQuarto = 0;
					while (opWhileMenuQuarto != 1) {
						telas.linhaDois();
						System.out.println(" ========== SGH - MENU QUARTOS ======== ");
						telas.linhaDois();
						telas.espaco();
						System.out.println("  1 - Cadastro ");
						System.out.println("  2 - Alteração ");
						System.out.println("  3 - Lista de Quartos");
						System.out.println(" 99 - EXCLUSÃO DE QUARTOS");
						System.out.println("  0 - MENU PRINCIPAL ");
						int opMenuQuarto = in.nextInt();
						in.nextLine();

						switch (opMenuQuarto) {
						case 1: {
							telas.linhaDois();
							System.out.println("SGH - Menu Quartos -> Cadastro");
							telas.linhaDois();
							String regNumeroQuarto = "";
							int quartoExistente = 0;
							while (quartoExistente != 1) {
								System.out.println("Digite o número do quarto: ");
								regNumeroQuarto = in.next();
								in.nextLine();
								if (quartos.size() == 0) {
									quartoExistente = 1;
									continue;
								} else {
									/// verifica duplicidade do quarto INICIO
									int contaquarto = 0;
									for (int confereQuarto = 0; confereQuarto < quartos.size(); confereQuarto++) {
										quartos tempQuartos = quartos.get(confereQuarto);

										if (regNumeroQuarto.equals(tempQuartos.getNumeroQuarto())) {
											contaquarto = contaquarto + 1;
										}
									}
									if (contaquarto == 0) {
										quartoExistente = 1;
									} else {
										System.out.println("QUARTO JÁ CADASTRADO");

									}

									// verifica duplicidade do quarto FIM

								}

							}

							System.out.println("Posição: ");
							String regPosicaoQuarto = in.next();
							in.nextLine();
							System.out.println("Quantidade de Camas: ");
							String regCamasQuarto = in.next();
							in.nextLine();
							String regPessoasQuarto = "nenhum";
							System.out.println("Lotação Máxima: ");
							String regLotacaoMaximaQuarto = in.next();
							in.nextLine();
							int confereFumante = 0;
							String regFumanteQuarto = "";
							while (confereFumante != 1) {
								System.out.println("Fumante S/N : ");
								regFumanteQuarto = in.next();
								in.nextLine();
								if (regFumanteQuarto.equals("S") || regFumanteQuarto.equals("N")) {
									confereFumante = 1;
								} else {
									System.out.println("Digite S ou N");
								}

							}
							System.out.println("Valor da diária: ");
							String regDiariaQuarto = in.next();
							in.nextLine();
							String regCodClienteVinculado = "nenhum";

							String regClienteVinculado = "nenhum";

							String regDataVinculo = "nenhum";

							String regStatusQuarto = "S";

							System.out.println("Confirma o Registro? 1 -> Sim    2-> Não");
							int okConfirmaRegistroQuarto = in.nextInt();
							in.nextLine();
							if (okConfirmaRegistroQuarto == 1) {

								quartos registroQuartos = new quartos(regNumeroQuarto, regPosicaoQuarto, regCamasQuarto,
										regPessoasQuarto, regLotacaoMaximaQuarto, regFumanteQuarto, regDiariaQuarto,
										regCodClienteVinculado, regClienteVinculado, regDataVinculo, regStatusQuarto);
								quartos.add(registroQuartos);
							}
							break;
						}
						case 2: {
							telas.linhaDois();
							System.out.println("SGH - MENU QUARTO -> ALTERAÇÃO ");
							telas.linhaDois();
							System.out.println("Número do Quarto a alterar: ");
							String numeroQuartoAlterar = in.next();

							if (numeroQuartoAlterar == "0") {
								break;
							}

							for (int contaQuartoAlterar = 0; contaQuartoAlterar < quartos
									.size(); contaQuartoAlterar++) {
								quartos tempQuartoAlterar = quartos.get(contaQuartoAlterar);
								if (numeroQuartoAlterar.equals(tempQuartoAlterar.getNumeroQuarto())) {
									telas.linhaDois();
									System.out.println("QUARTO LOCALIZADO. Selecione a oção de edição");
									telas.linhaDois();
									System.out.println("  1 - Posição");
									System.out.println("  2 - Quantidade de Camas");
									System.out.println("  3 - Lotação Máxima");
									System.out.println("  4 - Fumante S/N");
									System.out.println("  5 - Valor da Diária");
									telas.linhaDois();
									int opAlterarQuarto = in.nextInt();
									in.nextLine();
									if (opAlterarQuarto == 0) {
										break;
									}

									switch (opAlterarQuarto) {

									case 1: {
										System.out.println(
												" Posição Atual Registrada: " + tempQuartoAlterar.getPosicaoQuarto());
										System.out.println("Insira a nova Posição: ");
										String novaPosicaoQuarto = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim  2->Não");
										int okNovaPosicao = in.nextInt();
										in.nextLine();
										if (okNovaPosicao == 1) {
											tempQuartoAlterar.setPosicaoQuarto(novaPosicaoQuarto);
											telas.linhaDois();
											System.out.println("Registro Alterado com Sucesso!!!");
											telas.linhaDois();
										}
										break;
									}
									case 2: {
										System.out.println(" Quantidade de Camas RegistradaS: "
												+ tempQuartoAlterar.getCamasQuarto());
										System.out.println(" Insira a Quantidade Nova: ");
										String novaCamasQuarto = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim  2->Não");
										int okNovaCamasQuarto = in.nextInt();
										in.nextLine();
										if (okNovaCamasQuarto == 1) {
											tempQuartoAlterar.setCamasQuarto(novaCamasQuarto);
											telas.linhaDois();
											System.out.println("Registro Alterado com Sucesso!!!");
											telas.linhaDois();
										}
										break;
									}
									case 3: {
										System.out.println(" Lotação Máxima Registrada: "
												+ tempQuartoAlterar.getLotacaoMaximaQuarto());
										System.out.println(" Digite a nova Lotação Máxima: ");
										String novaLotacaoMaxima = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim  2->Não");
										int okNovaLotacaoMaxima = in.nextInt();
										in.nextLine();
										if (okNovaLotacaoMaxima == 1) {
											tempQuartoAlterar.setLotacaoMaximaQuarto(novaLotacaoMaxima);
											telas.linhaDois();
											System.out.println("Registro Alterado com Sucesso!!!");
											telas.linhaDois();
										}
										break;
									}
									case 4: {
										int fumanteVerificaWhile = 0;
										String novofumanteQuarto = "";
										while (fumanteVerificaWhile != 1) {
											System.out.println(" Quarto registrado como Fumante -> "
													+ tempQuartoAlterar.getFumanteQuarto());
											System.out.println(" Digite a nova condição de Fumante: ");
											novofumanteQuarto = in.next();
											in.nextLine();
											if (novofumanteQuarto.equals("S") || novofumanteQuarto.equals("N")) {
												fumanteVerificaWhile = 1;
											} else {
												System.out.println("Digite S ou N para validar a entrada");
											}

										}

										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim  2->Não");
										int okNovoFumanteQuarto = in.nextInt();
										in.nextLine();
										if (okNovoFumanteQuarto == 1) {
											tempQuartoAlterar.setFumanteQuarto(novofumanteQuarto);
											telas.linhaDois();
											System.out.println("Registro Alterado com Sucesso!!!");
											telas.linhaDois();
										}
										break;
									}
									case 5: {
										System.out.println(
												" Valor da Diária registrada: " + tempQuartoAlterar.getDiariaQuarto());
										System.out.println(" Digite o novo valor da diária: ");
										String novaDiariaQuarto = in.next();
										in.nextLine();
										System.out.println("CONFIRMA A ALTERAÇÃO? 1-> Sim  2->Não");
										int okNovaDiariaQuarto = in.nextInt();
										in.nextLine();
										if (okNovaDiariaQuarto == 1) {
											tempQuartoAlterar.setDiariaQuarto(novaDiariaQuarto);
											telas.linhaDois();
											System.out.println("Registro Alterado com Sucesso!!!");
											telas.linhaDois();
										}
										break;
									}

									}

								}

							}

							break;
						}
						case 3: {
							telas.linhaDois();
							System.out.println("SGH - RELATÓRIO DE QUARTOS");
							telas.linhaDois();

							for (int i = 0; i < quartos.size(); i++) {
								System.out.println(quartos.get(i));
								telas.linhaDois();
								telas.espaco();
							}

							break;
						}
						case 99: {
							telas.linhaDois();
							System.out.println("SGH - QUARTOS -> Exclusão");
							telas.linhaUm();
							System.out.println("Digite o quarto a ser excluído: ");
							String excluiQuarto = in.next();
							in.nextLine();
							for (int confereExcluiQuarto = 0; confereExcluiQuarto < quartos
									.size(); confereExcluiQuarto++) {
								quartos regQuartoExcluir = quartos.get(confereExcluiQuarto);
								if (excluiQuarto.equals(regQuartoExcluir.getNumeroQuarto())) {
									System.out.println("Quarto Localizado." + quartos);
									System.out.println("Confirma a exclusão? 1-> Sim   2->Não");
									int okExcluiQuarto = in.nextInt();
									in.nextLine();
									if (okExcluiQuarto == 1) {
										quartos.remove(confereExcluiQuarto);
										System.out.println(" QUARTO EXCLUÍDO COM SUCESSO");
									}

								}

							}

							break;
						}
						case 0: {
							opWhileMenuQuarto = 1;
							break;
						}

						} // SWITCH OPÇÃO MENU QUARTO

					} // WHILE OPÇÃO MENU QUARTO
					break;
				}
				case 3: {
					telas.linhaDois();
					System.out.println("SGH - CHECK IN");
					telas.linhaDois();
					System.out.println("Digite o código do cliente: ");
					String codCheckInCliente = in.next();
					in.nextLine();
					if (codCheckInCliente.equals("0")) {
						break;
					}

					for (int voltaCheckIn = 0; voltaCheckIn < clientes.size(); voltaCheckIn++) {

						clientes confereCheckInCliente = clientes.get(voltaCheckIn);

						if (codCheckInCliente.equals(confereCheckInCliente.getCodigoCliente())) {
							System.out.println(" CLIENTE LOCALIZADO " + confereCheckInCliente.getNomeCliente());
							String anteriorNomeCliente = confereCheckInCliente.getNomeCliente();
							String anteriorFumanteCliente = confereCheckInCliente.getFumanteCliente();
							String anteriorQuantasPessoasCliente = confereCheckInCliente.getQuantasPessoasCliente();
							int anteriorQuantasPessoasClienteInt = Integer.parseInt(anteriorQuantasPessoasCliente);
							int quartosEncontrados = 0;
							for (int quartoVoltaCheckIn = 0; quartoVoltaCheckIn < quartos
									.size(); quartoVoltaCheckIn++) {
								quartos confereCheckInQuartos = quartos.get(quartoVoltaCheckIn);
								int anteriorLotacaoMaximaQuartoInt = Integer
										.parseInt(confereCheckInQuartos.getLotacaoMaximaQuarto());

								if (confereCheckInQuartos.getStatusQuarto().equals("S")
										&& anteriorQuantasPessoasClienteInt <= anteriorLotacaoMaximaQuartoInt
										&& anteriorFumanteCliente.equals(confereCheckInQuartos.getFumanteQuarto())) {
									quartosEncontrados = quartosEncontrados + 1;
									telas.linhaUm();
									System.out.println("Quarto(s) Localizado(s)");
									telas.linhaUm();
									System.out.println("Quarto número : " + confereCheckInQuartos.getNumeroQuarto());
									System.out.println("Lotação quarto " + anteriorLotacaoMaximaQuartoInt);
									System.out.println(
											"Pessoas acompanhando Cliente:  " + anteriorQuantasPessoasClienteInt);
									System.out.println(
											"Quarto para fumante?  " + confereCheckInQuartos.getFumanteQuarto());
									System.out.println("Cliente fumante?  " + anteriorFumanteCliente);
									telas.espaco();
									System.out
											.println("Posição do Quarto: " + confereCheckInQuartos.getPosicaoQuarto());
									System.out.println("Diária do Quarto: " + confereCheckInQuartos.getDiariaQuarto());
									telas.espaco();

								}

							}
							if (quartosEncontrados > 0) {
								System.out.println("Informe o Quarto para CheckIn. 0-> Sai sem realizar o CheckIn");
								
							} else {
								System.out.println("NÃO LOCALIZADOS QUARTOS COM AS INFORMAÇÕES DO CLIENTE");
								System.out.println("Digite 0 (zero) e ENTER para prosseguir");
							}
							String numeroQuartoParaCheckIn = in.next();

							if (numeroQuartoParaCheckIn.equals("0")) {
								break;
							}
							System.out.println("CONFIRMA O REGISTRO PARA O QUARTO " + numeroQuartoParaCheckIn + " ?");
							System.out.println("1->Sim    2->Não");
							int okParaCheckInQuarto = in.nextInt();
							in.nextLine();
							if (okParaCheckInQuarto == 1) {
								telas.linhaDois();
								
								System.out.println("Confirme a data de Check In ");
								String dataentradaCheckIn = in.next();
								
								
								// INICIO CONFIRMAÇÃO DO CHECK IN
								for (int okQuartoVoltaCheckIn = 0; okQuartoVoltaCheckIn < quartos
										.size(); okQuartoVoltaCheckIn++) {
									quartos okConfirmaCheckInQuartos = quartos.get(okQuartoVoltaCheckIn);

									if (numeroQuartoParaCheckIn.equals(okConfirmaCheckInQuartos.getNumeroQuarto())) {
										okConfirmaCheckInQuartos.setPessoasQuarto(anteriorQuantasPessoasCliente);
										okConfirmaCheckInQuartos.setCodClienteVinculado(codCheckInCliente);
										okConfirmaCheckInQuartos.setClienteVinculado(anteriorNomeCliente);
										okConfirmaCheckInQuartos.setDataVinculo(dataentradaCheckIn);
										okConfirmaCheckInQuartos.setStatusQuarto("N");

									}

								}
								for (int okConfirmaCheckInCliente = 0; okConfirmaCheckInCliente < clientes
										.size(); okConfirmaCheckInCliente++) {

									clientes okRegistraCheckInCliente = clientes.get(okConfirmaCheckInCliente);

									if (codCheckInCliente.equals(okRegistraCheckInCliente.getCodigoCliente())) {

										okRegistraCheckInCliente.setQuartoCliente(numeroQuartoParaCheckIn);
										okRegistraCheckInCliente.setCheckInCliente(dataentradaCheckIn);

									}

								}

							} // FINAL confirmação do CHECK IN
						}

					}

					break;
				}
				case 4: {
					telas.linhaDois();
					System.out.println("SGH - CHECK OUT");
					telas.linhaDois();
					System.out.println("Digite o código do cliente: ");
					String codCheckOutCliente = in.next();
					in.nextLine();
					if (codCheckOutCliente.equals("0")) {
						break;
					}

					for (int voltaCheckOut = 0; voltaCheckOut < clientes.size(); voltaCheckOut++) {

						clientes confereCheckOutCliente = clientes.get(voltaCheckOut);

						if (codCheckOutCliente.equals(confereCheckOutCliente.getCodigoCliente())) {
							telas.linhaUm();
							System.out.println("Cliente Localizado " + confereCheckOutCliente.getNomeCliente());
							telas.linhaUm();
							System.out.println("REALIZAR CHECK OUT? 1 -> Sim    2-> Não");
							int okCheckOut = in.nextInt();
							in.nextLine();

							if (okCheckOut == 1) {
								System.out.println("DATA DE CHECK IN: " + confereCheckOutCliente.getCheckInCliente());
								System.out.println("QUARTO : " + confereCheckOutCliente.getQuartoCliente());
								double valordiaria = 0;
								
								Date datasaidaZ = new Date();
								DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
								String datasaida = dateFormat.format(datasaidaZ);
								
								confereCheckOutCliente.setCheckOutCliente(datasaida);
								String tempQuartoClienteCheckOut = confereCheckOutCliente.getQuartoCliente();
								confereCheckOutCliente.setQuartoCliente("nenhum");

								for (int okQuartoVoltaCheckOut = 0; okQuartoVoltaCheckOut < quartos
										.size(); okQuartoVoltaCheckOut++) {
									quartos okConfirmaCheckOutQuartos = quartos.get(okQuartoVoltaCheckOut);

									if (tempQuartoClienteCheckOut.equals(okConfirmaCheckOutQuartos.getNumeroQuarto())) {
										valordiaria = Integer.parseInt(okConfirmaCheckOutQuartos.getDiariaQuarto());
										okConfirmaCheckOutQuartos.setPessoasQuarto("0");
										okConfirmaCheckOutQuartos.setCodClienteVinculado("nenhum");
										okConfirmaCheckOutQuartos.setClienteVinculado("nenhum");
										okConfirmaCheckOutQuartos.setDataVinculo("nenhum");
										okConfirmaCheckOutQuartos.setStatusQuarto("S");
									}
								}
								
								
								DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
							       df.setLenient(false);
							        Date d1 = df.parse (confereCheckOutCliente.getCheckInCliente());
							        // System.out.println (d1);
							        Date d2 = df.parse (datasaida);
							        							        // System.out.println (d2);
							        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
							        long totaldias = dt/86400000L;
							        // System.out.println (dt / 86400000L); 
							        
							        double valorfinal = totaldias * valordiaria;
							        System.out.println("CLIENTE "+confereCheckOutCliente.getNomeCliente());
							        String dataEntrada = df.format(d1); 
							        String dataSaida = df.format(d2);
							        System.out.println("Data de Check In : " + dataEntrada);
							        System.out.println("Data de Check Out: " + dataSaida);
							        System.out.println("Total: "+totaldias + " dias");
							        System.out.println("VALOR FINAL DO CLIENTE "+(double) valorfinal);
								
								
								telas.linhaDois();
								System.out.println("CHECK OUT REALIZADO COM SUCESSO. O quarto "
										+ tempQuartoClienteCheckOut + " foi liberado");
							}

						}

					}

					break;
				}

				} //// fim do switch principal

				////// limite final do programa
			} catch (Exception e) {
				in.nextLine();

			} finally {

			} // TRY PRINCIPAL

		} // WHILE PRINCIPAL

	} // MAIN PRINCIPAL

}
// CLASS PRINCIPAL
